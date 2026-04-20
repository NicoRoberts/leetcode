package jumpgame2;

public class Driver {
    public static void main(String[] args) {
    //    Input: prices = [7,1,5,3,6,4]
    // Output: 5
//     Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [2,3,0,1,4]
// Output: 2
        //int[] nums = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
         int[] nums = {2,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        //int[] nums = {2,3,1,1,4};
        //int[] nums = {2, 1};
        Solution sol = new Solution();
        //int jumps = sol.jump(nums);
        int jumps = sol.jumpMaximize(nums);

        System.out.println(jumps);

    }
}
