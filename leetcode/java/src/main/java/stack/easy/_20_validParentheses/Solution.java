package stack.easy._20_validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    private final Map<Character, Character> bracketMap = new HashMap<>() {{
        put(')', '(');
        put('}', '{');
        put(']', '[');
    }};

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (Character c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == bracketMap.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}