package chapter6;

public class User {

  private final String id;

  public User(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        '}';
  }
}
