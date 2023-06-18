package chapter6.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  static {
    try {
      Class.forName("org.hsqldb.jdbc.JDBCDriver");
    } catch (ClassNotFoundException e) {
      throw new Error(e);
    }
  }

  static Connection get() throws SQLException {
    return DriverManager.getConnection("jdbc:hsqldb:db/mydatabase", "SA", "");
  }
}
