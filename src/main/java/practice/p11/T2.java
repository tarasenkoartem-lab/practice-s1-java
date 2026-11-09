package practice.p11;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/
public class T2 {

  // голосування Бойєра-Мура: однакові числа додають +1, інші -1
  // елемент що зустрічається більше n/2 разів завжди "переживе" всі інші
  // O(n) часу і O(1) пам'яті
  public int majorityElement(int[] nums) {
    int candidate = nums[0];
    int count = 0;
    for (int x : nums) {
      if (count == 0) {
        candidate = x;
      }
      count += (x == candidate) ? 1 : -1;
    }
    return candidate;
  }
}
