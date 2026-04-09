#include "Solution.h"
#include <vector>
#include <iostream>

int main() {
//   Input: nums = [2,2,1,1,1,2,2]
// Output: 2
  std::vector<int> nums = {2,2,1,1,1,2,2};
  Solution sol;
  int res = sol.majorityElement(nums);
  std::cout << "Majority Element is: " << res;
  return 0;
}