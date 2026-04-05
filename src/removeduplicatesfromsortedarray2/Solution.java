package removeduplicatesfromsortedarray2;

// Space O(1) - in place modification
// Time complexity O(n) - where n is the length of nums

public class Solution {
  public int removeDuplicates(int[] nums) {
    int originalPosition = 0;
    for (int i = 1; i < nums.length; i++) {
      int current = nums[i];
      if (originalPosition == 0 || current != nums[originalPosition - 1]) {
        originalPosition++;
        nums[originalPosition] = current;
      }
    }
    return originalPosition + 1;
  }
}
