package hash.usage.easy._387_FirstUniqueCharacterInAString.usingQueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> queue = new ArrayDeque<>();
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
                queue.add(c);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        int answer = -1;
        
        while (!queue.isEmpty()) {
            if (map.get(queue.peek()) == 1) {
                answer = queue.peek();
            } else {
                queue.remove();
            }
        }
        
        return answer;
    }
}
