package stack.medium._1614_maxNestingDepthOfParentheses;

import java.util.Stack;

class Solution {
    public int maxDepth(String str) {
        Stack<Character> stack = new Stack<>();
        int nestLevel = 0;
        int highestNestLevel = 0;
        
        for (Character c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                nestLevel += 1;
                
                if (nestLevel > highestNestLevel) {
                    highestNestLevel = nestLevel;
                }
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
                nestLevel -= 1;
            }
        }

        return highestNestLevel;
    }
}