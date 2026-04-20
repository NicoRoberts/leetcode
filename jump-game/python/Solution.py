from typing import List

# Space O(1)
# Speed O(n) where n is the nums length
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        #each index represents max jump length

        #return true if can reach last index, false otherwise

        #target = nums.length - 1

        #track a maximum

        #the only way we cant reach the end is if there is a zero

        #if our number of accumulated steps is less than target and we are at a zero

        # nums = [3,2,1,0,4] false
        # [2,3,1,1,4] true

        target = len(nums) - 1
        bestPosition = 0

        for i in range(0, len(nums)):
            current = nums[i]
            if (current + i > bestPosition):
                bestPosition = current + i

            if (i >= bestPosition and bestPosition != target):
                return False
            
            if (bestPosition >= target):
                return True

        
        return True

        