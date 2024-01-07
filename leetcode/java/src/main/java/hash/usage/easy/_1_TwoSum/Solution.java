package hash.usage.easy._1_TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        
        for (int num : array) {
            int difference = target - num;
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = index;

            }
            map.put(num, index);
            index += 1;
        }
        
        return result;
    }
    
}

// for every num, does map.get(target - num) exist?
    // if not, map.put(num, index)
    // if YES, [map.get(target - num), num]