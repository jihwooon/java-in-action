package chapter6;

import chapter6.domain.Twoot;

public class PrintingEndPointSnippets {

  public static void main(String[] args) {

    final ReceiverEndPoint anonymousClass = new ReceiverEndPoint() {

      @Override
      public void onTwoot(Twoot twoot) {
        System.out.println(twoot.getSenderId() + ": " + twoot.getContent());
      }
    };

    final ReceiverEndPoint lambda = twoot -> System.out.println(
        twoot.getSenderId() + ": " + twoot.getContent());

  }

}
