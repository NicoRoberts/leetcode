#include "Solution.h"
#include <unordered_map>

int Solution::majorityElement(std::vector<int>& nums) {
    std::unordered_map<int, int> map;

    for (int num : nums) {
        if (map.count(num) == 0) {
            map[num] = 1;
        } else {
            map[num]++;
        }
    }

    for (auto& [k, v] : map) {
        if (v > nums.size() / 2) {
            return k;
        }
    }
    return -1;
}