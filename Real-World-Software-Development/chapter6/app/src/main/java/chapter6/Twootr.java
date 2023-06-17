package chapter6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Twootr {

  private final UserRepository userRepository;

  public Twootr(final UserRepository userRepository) {
    this.userRepository = userRepository;
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

    return authenticatedUser.map(user -> new SenderEndPoint(user));
  }

}
