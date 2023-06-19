package chapter6;

import static chapter6.status.FollowStatus.ALREADY_FOLLOWING;
import static chapter6.status.FollowStatus.SUCCESS;

import chapter6.domain.KeyGenerator;
import chapter6.domain.Position;
import chapter6.domain.Twoot;
import chapter6.domain.User;
import chapter6.repository.TwootRepository;
import chapter6.repository.UserRepository;
import chapter6.status.FollowStatus;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Twootr {

  private final UserRepository userRepository;
  private final TwootRepository twootRepository;

  public Twootr(final UserRepository userRepository, final TwootRepository twootRepository) {
    this.userRepository = userRepository;
    this.twootRepository = twootRepository;
  }

  public Optional<SenderEndPoint> onLogon(final String userId, final String password,
      final ReceiverEndPoint receiverEndPoint) {
    Objects.requireNonNull(userId, "userId");
    Objects.requireNonNull(password, "password");

    Optional<User> authenticatedUser = userRepository
        .get(userId)
        .filter(userSameId -> {
          byte[] hashedPassword = KeyGenerator.hash(password, userSameId.getSalt());
          return Arrays.equals(hashedPassword, userSameId.getPassword());
        });

    authenticatedUser.ifPresent(user -> {
      user.onLogon(receiverEndPoint);
      twootRepository.query(
          new TwootQuery()
              .inUsers(user.getFollowing())
              .lastSeenPosition(user.getLastSeenPosition()),
          user::receiveTwoot);
      userRepository.update(user);
    });

    return authenticatedUser.map(user -> new SenderEndPoint(user, this));
  }

  public FollowStatus onFollow(final User follow, final String userIdToFollow) {

    if (follow.getId() == userIdToFollow) {
      return ALREADY_FOLLOWING;
    }

    return SUCCESS;
  }

  Position onSendTwoot(final String id, final User user, final String content) {
    String userId = user.getId();
    Twoot twoot = twootRepository.add(id, userId, content);
    user.followers()
        .filter(User::isLoggedOn)
        .forEach(follow -> follow.receiveTwoot(twoot));

    return twoot.getPosition();
  }

}
