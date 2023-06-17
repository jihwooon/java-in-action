package chapter6;

import java.util.Objects;
import java.util.Optional;

public class Twootr {

  private final UserRepository userRepository;

  public Twootr(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<SenderEndPoint> onLogon(final String userId,
      final ReceiverEndPoint receiver) {
    Objects.requireNonNull(userId, "userId");

    Optional<User> authenticatedUser = userRepository.get(userId)
        .filter(userId::equals);

    return authenticatedUser.map(user -> new SenderEndPoint(user));
  }

}
