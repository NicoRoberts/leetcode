from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        # Input: nums = [0,1,2,2,3,0,4,2], val = 2
        #Output: 5, nums = [0,1,4,0,3,_,_,_]

        #in place

        #order can be changed

        #counter = k
        start = 0
        end = len(nums) - 1
        counter = 0

        while (start <= end):
            if (nums[start] == val):
                temp = nums[start]
                nums[start] = nums[end]
                nums[end] = temp
                end -=1

            else:
                 counter+=1
                 start+=1


        return counter