package chapter6;

public class TestData {

  static final String USER_ID = "Joe";
  static final String OTHER_USER_ID = "John";
  static final String NOT_A_USER = "Jack";

  static final byte[] SALT = KeyGenerator.newSalt();
  static final String PASSWORD = "ahc5ez";
  static final byte[] PASSWORD_BYTES = KeyGenerator.hash(PASSWORD, SALT);

}
