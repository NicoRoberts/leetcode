#include "Solution.h"
#include <vector>

int Solution::removeDuplicates(std::vector<int>& nums) {
//     Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    int originalPosition = 0;
    for (int i = 1; i < nums.size(); i++) {
        int current = nums[i];
        if (current != nums[originalPosition]) {
          originalPosition++;
          nums[originalPosition] = current;
        }
    }
    return originalPosition+1;

}



