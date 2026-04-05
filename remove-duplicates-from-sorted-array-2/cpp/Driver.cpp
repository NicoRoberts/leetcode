#include "Solution.h"

#include <vector>
#include <iostream>

int main() {
//   Input: nums = [1,1,1,2,2,3]
// Output: 5, nums = [1,1,2,2,3,_]
  std::vector<int> nums = {1,1,1,2,2,3};

  Solution sol;
  int k = sol.removeDuplicates(nums);
  std::cout << "The elements that are unique are: " << k << "\n";
  for (int el: nums) {
    std::cout << el << " ";
  }

  return 0;
}