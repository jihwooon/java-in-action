package chapter6;

import chapter6.domain.Twoot;

public class PrintingEndPoint implements ReceiverEndPoint {

  @Override
  public void onTwoot(Twoot twoot) {
    System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
  }
}
