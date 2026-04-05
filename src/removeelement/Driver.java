package removeelement;

public class Driver {

    public static void main(String[] args) {

              //Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //Output: 5, nums = [0,1,4,0,3,
        // _,_,_]
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        Solution sol = new Solution();
        int k = sol.removeElement(nums, val);
        System.out.println();
        System.out.println(" ");

        System.out.println(k);
        System.out.println(java.util.Arrays.toString(nums));


    }

}
