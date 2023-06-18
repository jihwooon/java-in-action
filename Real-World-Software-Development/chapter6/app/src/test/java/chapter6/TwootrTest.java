package chapter6;

import static chapter6.TestData.TWOOT;
import static chapter6.TestData.twootAt;
import static chapter6.status.FollowStatus.ALREADY_FOLLOWING;
import static chapter6.status.FollowStatus.SUCCESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import chapter6.status.FollowStatus;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwootrTest {

  private static final Position POSITION_1 = new Position(0);

  private final ReceiverEndPoint receiverEndPoint = mock(ReceiverEndPoint.class);
  private UserRepository userRepository = mock(UserRepository.class);
  private TwootRepository twootRepository = mock(TwootRepository.class);

  private Twootr twootr;
  private User user;
  private SenderEndPoint endPoint;

  @BeforeEach
  public void setUp() {
    user = new User(TestData.USER_ID, TestData.PASSWORD_BYTES, TestData.SALT);
    twootr = new Twootr(userRepository, twootRepository);
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

    final String id = "1";

    endPoint.onFollow(TestData.OTHER_USER_ID);

    final SenderEndPoint otherEndPoint = otherLogon();
    otherEndPoint.onSendTwoot(id, TWOOT);

    verify(twootRepository).add(id, TestData.OTHER_USER_ID, TWOOT);
    verify(receiverEndPoint).onTwoot(new Twoot(id, TestData.OTHER_USER_ID, TWOOT, new Position(0)));

  }

  @Test
  public void shouldReceiveReplayOfTwootsAfterLogoff() {
    final String id = "1";

    userFollowsOtherUser();

    final SenderEndPoint otherEndPoint = otherLogon();
    otherEndPoint.onSendTwoot(id, TWOOT);

    logon();

    verify(receiverEndPoint).onTwoot(twootAt(id, POSITION_1));
  }

  private void logon() {
    this.endPoint = logon(TestData.USER_ID, receiverEndPoint);
  }

  private SenderEndPoint otherLogon() {
    return logon(TestData.OTHER_USER_ID, mock(ReceiverEndPoint.class));
  }

  private void userFollowsOtherUser()
  {
    logon();

    endPoint.onFollow(TestData.OTHER_USER_ID);

    endPoint.onLogoff();
  }

  private SenderEndPoint logon(final String userId, final ReceiverEndPoint receiverEndPoint) {
    final Optional<SenderEndPoint> endPoint = twootr.onLogon(userId, TestData.PASSWORD,
        receiverEndPoint);
    assertTrue(endPoint.isPresent(), "Failed to logon");
    return endPoint.get();
  }
}
