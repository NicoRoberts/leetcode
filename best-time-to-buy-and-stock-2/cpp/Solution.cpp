#include "Solution.h"

#include <vector>

// Space O(1)
// Time O(n)
int Solution::maxProfit(std::vector<int>& prices) {
        // Input: prices = [7,1,5,3,6,4]
    // Output: 7
    // Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    // Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    // Total profit is 4 + 3 = 7.

    int maxProfit = 0;
    int min = prices[0];
    
    for (int i = 1; i < prices.size(); i++) {
        if (prices[i] - min > 0) {
            maxProfit += prices[i] - min;
            min = prices[i];
        } else if (prices[i] < min) {
            min = prices[i];
        }
    }
    return maxProfit;

}