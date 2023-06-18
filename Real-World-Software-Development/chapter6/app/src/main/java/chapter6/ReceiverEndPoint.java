package chapter6;

import chapter6.domain.Twoot;

public interface ReceiverEndPoint {
  void onTwoot(Twoot twoot);
}
