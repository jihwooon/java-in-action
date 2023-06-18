package chapter6.examples;

import chapter6.ReceiverEndPoint;
import chapter6.Twoot;

public class PrintingEndPoint implements ReceiverEndPoint {

  @Override
  public void onTwoot(Twoot twoot) {
    System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
  }
}
