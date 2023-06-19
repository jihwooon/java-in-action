package chapter6.infra;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementRunner {
  private final Connection connection;

  public StatementRunner(Connection connection) {
    this.connection = connection;
  }

  <R> R extract(final String sql, final Extractor<R> extractor) {
    try (var stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      stmt.clearParameters();
      return extractor.run(stmt);
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
  }
}
