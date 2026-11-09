package practice.p11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 t = new T1();

  @Test
  void example1() {
    assertThat(t.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void example2() {
    assertThat(t.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void example3() {
    assertThat(t.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void missingZero() {
    assertThat(t.missingNumber(new int[] {1})).isEqualTo(0);
  }
}
