package removeduplicatesfromsortedarray;

public class Driver {

    public static void main(String[] args) {
// Input: nums = []
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution sol = new Solution();

        int k = sol.removeDuplicates(nums);
        System.out.println(java.util.Arrays.toString(nums));
        System.out.println(k);

    }

}
