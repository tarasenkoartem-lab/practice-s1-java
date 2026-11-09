package practice.p11;

// base
// https://leetcode.com/problems/missing-number/
public class T1 {

  // сума чисел від 0 до n = n * (n + 1) / 2
  // віднімаємо реальну суму масиву і залишається те число якого не вистачає
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int expected = n * (n + 1) / 2;
    int sum = 0;
    for (int x : nums) {
      sum += x;
    }
    return expected - sum;
  }
}
