from typing import List

class Solution:
    
    def majorityElement(self, nums: List[int]) -> int:
      # Input: nums = [2,2,1,1,1,2,2]
      # Output: 2
      leadingCandidate = nums[0]
      counter = 1
      for i in range(1, len(nums)):
        if leadingCandidate == nums[i]:
           counter+=1
        elif counter > 0 and leadingCandidate != nums[i]:
          counter-=1
        else:
           leadingCandidate = nums[i]
           counter = 1
      return leadingCandidate
