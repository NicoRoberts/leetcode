#include "Solution.h"
#include <vector>
#include <iostream>

int main() {
    std::vector<int> nums = {1,2};
    int k = 2;
    Solution sol;
    sol.rotate(nums, k);
    std::cout << "The rotated array " << k << "spots to the right is: ";
    for (int num : nums) {
        std::cout << num;
    }
    return 0;
}