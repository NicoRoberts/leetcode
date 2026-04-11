#include "Solution.h"
#include <vector>
#include <algorithm>
// Speed - O(n / 2) + O(n / 2) + O(n / 2) = O(n)
// Space O(1)

void Solution::rotate(std::vector<int>& nums, int k) {
    int kMod = k % nums.size();
    //k = 3
    //1,2,3,4,5,6,7
    //7,1,2,3,4,5,6
    //6,7,1,2,3,4,5
    //5,6,7,1,2,3,4

    std::reverse(nums.begin(), nums.end());
    // 7,6,5,4,3,2,1

    std::reverse(nums.begin(), nums.begin() + kMod);
    // 5,6,7,4,3,2,1

    std::reverse(nums.begin() + kMod, nums.end());
    // 5,6,7,1,2,3,4

}