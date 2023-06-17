package chapter6;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class TwootrTest {

  private final ReceiverEndPoint receiverEndPoint = mock(ReceiverEndPoint.class);

  @Test
  public void shouldBeAbleToAuthenticateUser() {
    logon();
  }

  private void logon() {
    Twootr twootr = new Twootr();
    SenderEndPoint endPoint = twootr.onLogin(TestData.USER_ID, receiverEndPoint);

    assertThat(endPoint).isNull();
  }
}
