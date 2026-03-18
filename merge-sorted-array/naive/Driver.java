package naive;
public class Driver {

    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] nums = sol.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums.length; i++) {
          System.out.println(nums[i]);
        }
    }

}
