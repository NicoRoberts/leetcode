#include "Solution.h"
#include <vector>

int Solution::removeElement(std::vector<int>& nums, int val) {
    int start = 0;
    int end = nums.size() - 1;
    int counter = 0;

    while (start <= end) {
        if (nums[start] == val) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]  = temp;
            end--;
        } else {
            counter++;
            start++;
        }
    }
    return counter;




//     Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
}



