#include "Solution.h"

#include <vector>
#include <iostream>

int main() {
  std::vector<int> nums = {0,0,1,1,1,2,2,3,3,4};
  int val = 2;

  Solution sol;
  int k = sol.removeDuplicates(nums);
  std::cout << "The elements that are unique are: " << k << "\n";
  for (int el: nums) {
    std::cout << el << " ";
  }

  return 0;
}