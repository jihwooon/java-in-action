package chapter6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwootrTest {

  private final ReceiverEndPoint receiverEndPoint = mock(ReceiverEndPoint.class);
  private UserRepository userRepository = mock(UserRepository.class);
  private Twootr twootr;

  @BeforeEach
  public void setUp() {
    twootr = new Twootr(userRepository);
  }

  @Test
  public void shouldBeAbleToAuthenticateUserWithWrongPassword() {
    Optional<SenderEndPoint> endPoint = twootr.onLogon(TestData.USER_ID, "bad password",receiverEndPoint);
    assertFalse(endPoint.isPresent());
  }
}
