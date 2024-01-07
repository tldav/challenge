package hash.usage.easy._217_ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
}
