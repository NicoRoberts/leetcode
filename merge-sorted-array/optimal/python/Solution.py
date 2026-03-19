from typing import List


class Solution:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = m - 1
        j = n - 1
        k = m + n - 1

        if (n == 0):
            return
        
        while j >= 0:
            if (i < 0 or nums2[j] >= nums1[i]):
                nums1[k] = nums2[j]
                j -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
            k -= 1

        