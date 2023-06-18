package chapter6.repository;

import chapter6.Twoot;
import chapter6.TwootQuery;
import java.util.Optional;
import java.util.function.Consumer;

public interface TwootRepository {

  Twoot add(String id, String userId, String content);

  Optional<Twoot> get(String id);

  void delete(Twoot twoot);

  void query(TwootQuery twootQuery, Consumer<Twoot> callback);

  void clear();
}
