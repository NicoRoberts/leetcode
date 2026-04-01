package removeelement.optimal;

// Speed - O(n)
// Space - O(1)

public class Solution {
  public int removeElement(int[] nums, int val) {
        // in place

        //  The order of the elements may be changed

        // k number of elements that do not equal val

        // linearly remove elements basic === probably not right

        //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3,_,_,_]

        int start = 0;
        int end = nums.length - 1;
        int count = 0;

        while (start <= end) {
          //check
          if (nums[start] == val) {
              int temp = nums[start];
              nums[start] = nums[end];
              nums[end] = temp;
              end--;

          } else {
            start++;
            count++;
          }
        }

        return count;


    }

}
