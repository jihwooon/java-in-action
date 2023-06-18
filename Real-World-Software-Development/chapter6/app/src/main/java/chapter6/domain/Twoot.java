package chapter6.domain;

import java.util.Objects;

public class Twoot {

  private final String id;
  private final String senderId;
  private final String content;
  private final Position position;

  public Twoot(final String id, final String senderId, final String content, final Position position) {
    Objects.requireNonNull(id, "id");
    Objects.requireNonNull(senderId, "senderId");
    Objects.requireNonNull(content, "content");
    Objects.requireNonNull(position, "position");

    this.id = id;
    this.position = position;
    this.senderId = senderId;
    this.content = content;
  }

  public boolean isAfter(final Position otherPosition) {
    return position.getValue() > otherPosition.getValue();
  }

  public String getId() {
    return id;
  }

  public String getSenderId() {
    return senderId;
  }

  public String getContent() {
    return content;
  }

  public Position getPosition() {
    return position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Twoot twoot = (Twoot) o;
    return Objects.equals(id, twoot.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Twoot{" +
        "id='" + id + '\'' +
        ", senderId='" + senderId + '\'' +
        ", content='" + content + '\'' +
        ", position=" + position +
        '}';
  }
}
