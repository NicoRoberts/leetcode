from typing import List


class Solution:
  def removeDuplicates(self, nums: List[int]) -> int:
    #         Input: nums = [0,0,1,1,1,2,2,3,3,4]
    # Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    originalPosition = 0
    for i in range (1, len(nums)):
      current = nums[i]
      if (current != nums[originalPosition]):
        originalPosition+=1
        nums[originalPosition] = current


    return originalPosition + 1
  
  #A follow up might be what if you're allowed at most 2 of the same elements 
  def removeDuplicatesTweak(self, nums: List[int]) -> int:
    #         Input: nums = [0,1,1,1,2,2,3,3,3,3,4,4]
    # Output: 9, nums = [0,1,2,3,4,_,_,_,_,_]

    originalPosition = 0
    for i in range (1, len(nums)):
      current = nums[i]
      if (originalPosition == 0 or nums[originalPosition - 1] != current):
        originalPosition+=1
        nums[originalPosition] = current


    return originalPosition + 1