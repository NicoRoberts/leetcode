#include "Solution.h"

#include <vector>
#include <iostream>

int main() {
//     Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
  std::vector<int> nums = {0,1,2,2,3,0,4,2};
  int val = 2;

  Solution sol;
  int k = sol.removeElement(nums, val);
  std::cout << "The elements that are not val are: " << k << "\n";
  for (int el: nums) {
    std::cout << el << " ";
  }

  return 0;
}