package chapter6;

import static chapter6.FollowStatus.ALREADY_FOLLOWING;
import static chapter6.FollowStatus.SUCCESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwootrTest {

  private final ReceiverEndPoint receiverEndPoint = mock(ReceiverEndPoint.class);
  private UserRepository userRepository = mock(UserRepository.class);

  private Twootr twootr;
  private User user;
  private SenderEndPoint endPoint;

  @BeforeEach
  public void setUp() {
    user = new User(TestData.USER_ID, TestData.PASSWORD_BYTES, TestData.SALT);
    twootr = new Twootr(userRepository);
    endPoint = new SenderEndPoint(user, twootr);
  }

  @Test
  public void shouldBeAbleToAuthenticateUserWithWrongPassword() {
    Optional<SenderEndPoint> endPoint = twootr.onLogon(TestData.USER_ID, "bad password",
        receiverEndPoint);
    assertFalse(endPoint.isPresent());
  }

  @Test
  public void shouldFollowValidUser() {
    FollowStatus followStatus = endPoint.onFollow(TestData.OTHER_USER_ID);

    assertThat(followStatus).isEqualTo(SUCCESS);
  }

  @Test
  public void shouldNotDuplicateFollowValidUser() {
    endPoint.onFollow(TestData.USER_ID);
    FollowStatus followStatus = endPoint.onFollow(TestData.USER_ID);

    assertThat(followStatus).isEqualTo(ALREADY_FOLLOWING);
  }

  @Test
  public void shouldReceiveTwootsFromFollowedUser() {

  }

  private void logon() {
    this.endPoint = logon(TestData.USER_ID, receiverEndPoint);
  }

  private SenderEndPoint logon(final String userId, final ReceiverEndPoint receiverEndPoint) {
    final Optional<SenderEndPoint> endPoint = twootr.onLogon(userId, TestData.PASSWORD,
        receiverEndPoint);
    assertTrue(endPoint.isPresent(), "Failed to logon");
    return endPoint.get();
  }
}
