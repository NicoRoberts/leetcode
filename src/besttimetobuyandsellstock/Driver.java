package besttimetobuyandsellstock;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
    //    Input: prices = [7,1,5,3,6,4]
    // Output: 5
        int[] prices = {2,4,1};
        Solution sol = new Solution();
        int maxProfit = sol.maxProfit(prices);

        System.out.println(maxProfit);

    }
}
