package chapter6;

import chapter6.status.FollowStatus;
import java.util.Objects;

public class SenderEndPoint {

  private final User user;
  private final Twootr twootr;

  public SenderEndPoint(User user, Twootr twootr) {
    this.user = user;
    this.twootr = twootr;
  }

  public FollowStatus onFollow(final String userIdToFollow) {
    Objects.requireNonNull(userIdToFollow, "userIdToFollow");

    return twootr.onFollow(user, userIdToFollow);
  }

  public Position onSendTwoot(final String id, final String content) {
    Objects.requireNonNull(content, "content");

    return twootr.onSendTwoot(id, user, content);
  }

  public void onLogoff() {
    user.onLogoff();
  }

}
