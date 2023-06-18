package chapter6.infra;

import chapter6.TwootQuery;
import chapter6.domain.Position;
import chapter6.domain.Twoot;
import chapter6.repository.TwootRepository;
import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Consumer;

public class DatabaseTwootRepository implements TwootRepository {

  private final StatementRunner statementRunner;
  private Position position = Position.INITIAL_POSITION;

  public DatabaseTwootRepository() {
    try {
      var conn = DatabaseConnection.get();
      conn.createStatement()
          .executeUpdate(
              "CREATE TABLE IF NOT EXISTS " +
                  "twoots (" +
                  "position INT IDENTITY," +
                  "id VARCHAR(36) UNIQUE NOT NULL," +
                  "senderId VARCHAR(15) NOT NULL," +
                  "content VARCHAR(140) NOT NULL" +
                  ")");
      statementRunner = new StatementRunner(conn);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
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
  public void query(TwootQuery twootQuery, Consumer<Twoot> callback) {

  }

  @Override
  public void clear() {

  }
}
