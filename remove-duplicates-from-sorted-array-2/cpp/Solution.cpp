#include "Solution.h"
#include <vector>

int Solution::removeDuplicates(std::vector<int>& nums) {
//   Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]

  int originalPosition = 0;
  for (int i = 1; i < nums.size(); i++) {
    int current = nums[i];
    if (originalPosition == 0 || current != nums[originalPosition]) {
      originalPosition++;
      nums[originalPosition] = current;
    }
  }
  return originalPosition + 1;

}



