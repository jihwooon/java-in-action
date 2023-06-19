package chapter6.in_memoryRepository;

import chapter6.domain.User;
import chapter6.repository.UserRepository;
import chapter6.status.FollowStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {
  private final Map<String, User> userIdToUser = new HashMap<>();

  @Override
  public Optional<User> get(final String userId) {
    return Optional.ofNullable(userIdToUser.get(userId));
  }

  @Override
  public boolean add(final User user) {
    return userIdToUser.putIfAbsent(user.getId(), user) == null;
  }

  @Override
  public void update(final User user) {
    // Deliberately blank - since we don't actually persist this data
  }

  @Override
  public FollowStatus follow(final User follower, final User userToFollow) {
    return userToFollow.addFollower(follower);
  }

  @Override
  public void clear() {
    userIdToUser.clear();
  }

  @Override
  public void close() {

  }
}
