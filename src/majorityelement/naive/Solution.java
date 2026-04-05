package majorityelement.naive;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Speed - O(n) - where n is the length of nums. + additional for keys of frequency.
// Space - O(n) - where n equals unique elements in the nums array.

public class Solution {

    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

  public int majorityElement(int[] nums) {
      for (int el: nums) {
        if (map.containsKey(el)) {
          int frequency = map.get(el);
          map.replace(el, ++frequency);
        } else {
          map.put(el, 1);
        }
      }

      for (int key: map.keySet()) {
        if (map.get(key) > (nums.length / 2)){
          return key;
        }
      }
      return 0;

    }

    // AI suggestion
  public int majorityElement2(int[] nums) {
    for (int el : nums) {
      map.put(el, map.getOrDefault(el, 0) + 1);
    }

    return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

  }

  public int majorityElement3(int[] nums) {
    Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
  

}
