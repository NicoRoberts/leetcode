// Speed - O(n) - going though a portion of the input array for storage as well as swap, and then the rest to fill the storage.
// Space - O(nums.length - kMod)

package rotatearray.naive;

public class Solution {
    public void rotate(int[] nums, int k) {
      int kMod = k % nums.length;

      if (kMod == 0) {
        return;
      }

      int[] storage = new int[nums.length - kMod];

      for (int i = 0; i < storage.length; i++) {
        storage[i] = nums[i];
      }

      //swap nums.length - k to the end to the beginning
      int beginningPointer = 0;
      for (int j = nums.length - kMod; j < nums.length; j++) {
        nums[beginningPointer] = nums[j];
        beginningPointer++;
      }

      //fill in from storage from index storage.length - 1 to nums.length - 1
      beginningPointer = 0;
      for (int i = nums.length - storage.length; i < nums.length; i++) {
        nums[i] = storage[beginningPointer];
        beginningPointer++;
      }
    }
}
