package practice.p11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 t = new T2();

  @Test
  void example1() {
    assertThat(t.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(t.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void single() {
    assertThat(t.majorityElement(new int[] {7})).isEqualTo(7);
  }

  @Test
  void negative() {
    assertThat(t.majorityElement(new int[] {-1, 5, -1})).isEqualTo(-1);
  }
}
