package chapter6;

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
}
