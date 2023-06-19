package chapter6.domain;

import static chapter6.domain.Position.INITIAL_POSITION;
import static java.util.Comparator.comparingInt;
import static java.util.function.BinaryOperator.maxBy;

import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

  private final BinaryOperator<Position> maxPosition = maxBy(comparingInt(Position::getValue));

  Twoot combineTwootsBy(final List<Twoot> twoots, final String senderId, final String newId) {
    return twoots
        .stream()
        .reduce(
            new Twoot(newId, senderId, "", INITIAL_POSITION),
            (acc, twoot) -> new Twoot(newId,
                senderId,
                twoot.getContent() + acc.getContent(),
                maxPosition.apply(acc.getPosition(), twoot.getPosition())));
  }
}
