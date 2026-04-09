#include "Solution.h"
#include <unordered_map>

int Solution::majorityElement(std::vector<int>& nums) {
  // Input: nums = [2,2,1,1,1,2,2]
  // Output: 2
  int leadingCandidate = nums[0];
  int counter = 1;

  for (int i = 1; i < nums.size(); i++) {
    int num = nums[i];
    if (leadingCandidate == num) {
      counter++;
    } else if (counter > 0) {
      counter--;
    } else {
      leadingCandidate = num;
      counter = 1;
    }
  }
  return leadingCandidate;
}