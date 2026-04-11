#include "Solution.h"

#include <vector>
#include <iostream>

int main() {
    // Input: prices = [7,1,5,3,6,4]
    // Output: 7
    // Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    // Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    // Total profit is 4 + 3 = 7.
    // std::vector<int> prices = {7,1,5,3,6,4};
    // std::vector<int> prices = {1,2,3,4,5};
    std::vector<int> prices = {7,6,4,3,1};
    Solution sol;
    int maxProfit = sol.maxProfit(prices);
    std::cout << "The max profit is: " << maxProfit;
    return 0;
}