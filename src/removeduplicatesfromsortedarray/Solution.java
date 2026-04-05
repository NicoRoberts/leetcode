package removeduplicatesfromsortedarray;

// Speed - O(n)
// Space - O(1)

public class Solution {
  public int removeDuplicates(int[] nums) {
        int counter = 1;
        int currentOriginalPosition = 0;
    
        for (int i = 1; i < nums.length; i++) {
          int current = nums[i];
          if (current != nums[currentOriginalPosition]) {
            currentOriginalPosition++;
            nums[currentOriginalPosition] = current;
            counter++;
          }
        }
        return counter;
  }

}
