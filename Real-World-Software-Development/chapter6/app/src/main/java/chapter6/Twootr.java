package chapter6;

import static chapter6.FollowStatus.ALREADY_FOLLOWING;
import static chapter6.FollowStatus.SUCCESS;

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
      final ReceiverEndPoint receiver) {
    Objects.requireNonNull(userId, "userId");
    Objects.requireNonNull(password, "password");

    Optional<User> authenticatedUser = userRepository
        .get(userId)
        .filter(userSameId -> {
          byte[] hashedPassword = KeyGenerator.hash(password, userSameId.getSalt());
          return Arrays.equals(hashedPassword, userSameId.getPassword());
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
