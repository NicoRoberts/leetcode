package jumpgame2;

// O(1) space
//O (n) time complexity where n is the number length

public class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int farthest = nums[0];
        int currentEnd = nums[0];
        int target = nums.length - 1;

        for (int i = 1; i < nums.length; i++) {
            if (i <= farthest && nums[i] + i > farthest) {
                farthest = nums[i] + i;
            }

            if (i == currentEnd || i >= target) {
                jumps++;
                currentEnd = farthest;
            }

        }

        return jumps;
    }

}

