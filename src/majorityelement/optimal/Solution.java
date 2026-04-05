package majorityelement.optimal;

//Speed - O(n) - where n is equal to the length of nums.
//Space Complexity - 0(1) - no additional storage

public class Solution {
  public int majorityElement(int[] nums) {
      // [2,2,1,1,1,2,2]
      int candidate1 = nums[0];
      int counter = 1;

      for (int i = 1; i < nums.length; i++) {
        int current = nums[i];
        if (current == candidate1) {
          counter++;
        } else if (current != candidate1 && counter > 0) {
          counter--;
        } else {
          candidate1 = current;
          counter++;
        }
      }

      return candidate1;

    }
  

}
