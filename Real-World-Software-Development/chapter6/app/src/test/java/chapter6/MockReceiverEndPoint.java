package chapter6;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class MockReceiverEndPoint implements ReceiverEndPoint {

  private final List<Twoot> receivedTwoots = new ArrayList<>();

  @Override
  public void onTwoot(final Twoot twoot) {
    receivedTwoots.add(twoot);
  }

  public void verifyOnTwoot(final Twoot twoot) {
    assertThat(receivedTwoots).contains(twoot);
  }
}
