package chapter6;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class User {

  private final String id;
  private final byte[] password;
  private final byte[] salt;
  private final Set<User> followers = new HashSet<>();

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

  Stream<User> followers() {
    return followers.stream();
  }

  void onLogon(final ReceiverEndPoint receiverEndPoint) {
    this.receiverEndPoint = receiverEndPoint;
  }

  boolean isLoggedOn() {
    return receiverEndPoint != null;
  }

  boolean receiveTwoot(final Twoot twoot) {
    if (isLoggedOn()) {
      receiverEndPoint.onTwoot(twoot);
      return true;
    }

    return false;
  }

  void onLogoff() {
    receiverEndPoint = null;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        '}';
  }
}
