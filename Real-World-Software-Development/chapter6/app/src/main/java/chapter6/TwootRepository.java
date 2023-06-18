package chapter6;

import java.util.Optional;

public interface TwootRepository {

  Twoot add(String id, String userId, String content);

  Optional<Twoot> get(String id);

  void clear();
}
