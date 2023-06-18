package chapter6.infra;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Extractor<R> {
  R run(PreparedStatement statement) throws SQLException;
}
