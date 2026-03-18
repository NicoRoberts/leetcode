package naive;
// Time Complexity - O(m*n)
// Space Complexity - O(1)
public class Solution {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
      if (n == 0) {
          return nums1;
      }

        int current = 0;
        int mergedIndex = 0;
        int end = m;
        for (int i = 0; i < n; i++) {
            boolean merged = false;
            int swap = nums1[mergedIndex];
            
            while (current < end) {
                if (!merged && (nums1[current] >= nums2[i])) {
                  swap = nums1[current];
                  nums1[current] = nums2[i];
                  merged = true;
                  mergedIndex = current;
                  end++;
                } else if (merged) {
                  int currentSwap = nums1[current];
                  nums1[current] = swap;
                  swap = currentSwap;
                }
                current++;
            }
            if (!merged) {
              nums1[current] = nums2[i];
              mergedIndex = current;
              end++;
            }
            current = mergedIndex;
        }
      return nums1;
    }

}