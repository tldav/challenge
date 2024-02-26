package hash.usage.easy._387_FirstUniqueCharacterInAString.usingLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        int i = 0;
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                map.put(c, null);
            }
            i++;
        }
        
        System.out.println(map);
        
        int index = 0;
        for (char c : map.keySet()) {
            if (map.get(c) != null) {
                return map.get(c);
            }
            System.out.println(index);
            index += 1;
        }
        
        return -1;
    }
}
