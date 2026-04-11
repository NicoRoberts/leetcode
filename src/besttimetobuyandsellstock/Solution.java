package besttimetobuyandsellstock;

// O(1) space
//O (n) time complexity where n is the prices length.

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int min = prices[0];
        int maxProfit = 0;
        // 2,6,1,3,7
        for (int i = 1; i < prices.length; i++) {
            // check
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            } else if (prices[i] < min) {
                min = prices[i];
            }         
        }
        return maxProfit;
    }
}

