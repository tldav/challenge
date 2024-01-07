package stack.easy._1021_removeOutermostParentheses;

import java.util.*;

class Solution {
    
    private final Map<Character, Character> bracketMap = new HashMap<>() {{
        put(')', '(');

    }};
    
    public String removeOuterParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        
        for (Character c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == bracketMap.get(c)) {
                stack.pop();
                if (!stack.isEmpty()) {
                    stringBuilder.append(c);
                }
            } else {
                if (!stack.isEmpty()) {
                    stringBuilder.append(c);
                }
                stack.push(c);
            }
            
        }
        return stringBuilder.toString();
    }
}
