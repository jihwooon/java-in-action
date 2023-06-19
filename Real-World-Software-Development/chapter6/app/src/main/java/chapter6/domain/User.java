package chapter6.domain;

import static chapter6.status.FollowStatus.ALREADY_FOLLOWING;
import static chapter6.status.FollowStatus.SUCCESS;

import chapter6.ReceiverEndPoint;
import chapter6.status.FollowStatus;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class User {

  private final String id;
  private final byte[] password;
  private final byte[] salt;

  private final Set<User> followers = new HashSet<>();
  private final Set<String> following = new HashSet<>();

  private Position lastSeenPosition;
  private ReceiverEndPoint receiverEndPoint;

  public User(String id, byte[] password, byte[] salt) {
    this.id = id;
    this.password = password;
    this.salt = salt;
  }

  public String getId() {
    return id;
  }

  public byte[] getPassword() {
    return password;
  }

  public byte[] getSalt() {
    return salt;
  }

  public Stream<User> followers() {
    return followers.stream();
  }

  public void onLogon(final ReceiverEndPoint receiverEndPoint) {
    this.receiverEndPoint = receiverEndPoint;
  }

  public boolean isLoggedOn() {
    return receiverEndPoint != null;
  }

  public boolean receiveTwoot(final Twoot twoot) {
    if (isLoggedOn()) {
      receiverEndPoint.onTwoot(twoot);
      return true;
    }

    return false;
  }

  public Set<String> getFollowing() {
    return following;
  }

  public void onLogoff() {
    receiverEndPoint = null;
  }

  public Position getLastSeenPosition() {
    return lastSeenPosition;
  }

  public FollowStatus addFollower(final User user) {
    if (followers.add(user)) {
      user.following.add(id);
      return SUCCESS;
    } else {
      return ALREADY_FOLLOWING;
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        '}';
  }

}
