package majorityelement.optimal;

public class Driver {

    public static void main(String[] args) {
//         Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
      int[] nums = {2,2,1,1,1,2,2};
      Solution sol = new Solution();
      int majorityElement = sol.majorityElement(nums);
      System.out.println(majorityElement);

    }

}
