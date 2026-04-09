package rotatearray.naive;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
              // Input: nums = [1,2,3,4,5,6,7], k = 3
        int[] nums = {1,2,3,4,5,6,7};
        int k = 5;
        Solution sol = new Solution();
        sol.rotate(nums, k);
        System.out.println(Arrays.toString(nums));

    }
}
