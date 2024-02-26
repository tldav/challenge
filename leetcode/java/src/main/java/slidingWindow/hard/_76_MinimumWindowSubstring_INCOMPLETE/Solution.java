package slidingWindow.hard._76_MinimumWindowSubstring_INCOMPLETE;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character, Integer> requirements = new HashMap<>();
        Map<Character, Integer> tracker = new HashMap<>();
        
        for (char c : t.toCharArray()) {
            requirements.merge(c, 1, Integer::sum);
        }
        
        for (char c : t.toCharArray()) {
            tracker.put(c, 0);
        }
        
        int left = 0;
        int right = 0;
        
        for (char c : s.toCharArray()) {
            if (requirements.containsKey(c)) {
                tracker.put(c, tracker.get(c) + 1);
                right ++;
            }
        }
        
    
        System.out.println(requirements);
        System.out.println(tracker);
        return null;
    }
}


/**
 *
 * ADOBECODEBANC
 *
 * ABC
 *
 * left = 0
 * right = 2
 *
 * while contents from 0 to 2 do not contain ABC
 *  right ++
 *
 * left = 0
 * right = 3
 *
 * ? no
 *  right ++ (skip to 5)
 *
 * left = 0
 * right = 5
 *
 * ? yes
 *  set answer to AD0BEC    size = 6
 *  left ++
 *
 * left = 1
 * right = 5
 *
 * Does D0BEC contain all characters?
 * no
 *  right ++
 *
 * left = 1
 * right = 6    DOBECO
 *
 * left = 1
 * right = 7    DOBECOD
 *
 * left = 1
 * right = 8    DOBECOE
 *
 * left = 1
 * right = 9    DOBECOEB
 *
 * left = 1
 * right = 10   DOBE COEBA
 *
 * left = 5
 * right = 10   COEBA
 *
 *
 *
 */

