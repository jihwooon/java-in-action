package chapter6.in_memoryRepository;

import chapter6.TwootQuery;
import chapter6.domain.Position;
import chapter6.domain.Twoot;
import chapter6.repository.TwootRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class InMemoryTwootRepository implements TwootRepository {

  private final List<Twoot> twoots = new ArrayList<>();

  private Position currentPosition = Position.INITIAL_POSITION;

  public void queryLoop(final TwootQuery twootQuery, final Consumer<Twoot> callback) {

    if (!twootQuery.hasUsers()) {
      return;
    }

    Position lastSeenPosition = twootQuery.getLastSeenPosition();
    Set<String> inUsers = twootQuery.getInUsers();

    for (Twoot twoot : twoots) {
      if (inUsers.contains(twoot.getSenderId()) && twoot.isAfter(lastSeenPosition)) {
        callback.accept(twoot);
      }
    }
  }

  @Override
  public void query(final TwootQuery twootQuery, final Consumer<Twoot> callback) {

    if (!twootQuery.hasUsers()) {
      return;
    }

    Position lastSeenPosition = twootQuery.getLastSeenPosition();
    Set<String> inUsers = twootQuery.getInUsers();

    twoots.stream()
        .filter(twoot -> inUsers.contains(twoot.getSenderId()))
        .filter(twoot -> twoot.isAfter(lastSeenPosition))
        .forEach(callback);
  }

  @Override
  public Twoot add(String id, String userId, String content) {
    return null;
  }

  @Override
  public Optional<Twoot> get(String id) {
    return Optional.empty();
  }

  @Override
  public void delete(Twoot twoot) {

  }

  @Override
  public void clear() {

  }
}
