package chapter6;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("KeyGenerator")
class KeyGeneratorTest {

  private KeyGenerator keyGenerator;

  @BeforeEach
  public void setUp() {
    this.keyGenerator = new KeyGenerator();
  }

  @Nested
  @DisplayName("newSalt 메서드는")
  class Describe_newSalt {

    @Test
    @DisplayName("임의의 salt를 반환한다.")
    public void It_return_random_salt() {
      byte[] salt = keyGenerator.newSalt();

      assertThat(salt).isNotNull();
    }
  }

  @Nested
  @DisplayName("hash 메서드는")
  class Describe_hash {

    String rawPassword = "bike1234";

    @Test
    @DisplayName("임의의 hasedPassword를 반환한다.")
    public void It_return_random_hashedPassword() {
      byte[] salt = keyGenerator.newSalt();
      byte[] hashedPassword = keyGenerator.hash(rawPassword, salt);

      assertThat(hashedPassword).isNotEqualTo(rawPassword);
    }
  }
}
