package chapter6;

import java.util.Optional;

public interface UserRepository extends AutoCloseable {

  Optional<User> get(String userId);

}
