from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        kMod = k % len(nums)
        nums.reverse()
        nums[:kMod] = nums[:kMod][::-1]
        nums[kMod:] = nums[kMod:][::-1]