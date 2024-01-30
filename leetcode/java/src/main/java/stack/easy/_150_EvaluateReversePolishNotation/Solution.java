package stack.easy._150_EvaluateReversePolishNotation;

import java.util.List;
import java.util.Stack;

class Solution {
    private final List<String> symbols = List.of(new String[]{"+", "-", "*", "/"});
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (!symbols.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                stack.push(this.calc(token, stack.pop(), stack.pop()));
            }
        }
        return stack.pop();
    }
    
    private int calc(String symbol, int a, int b) {
        if (symbol.equals("+")) {
            return b + a;
        }
        if (symbol.equals("-")) {
            return b - a;
        }
        if (symbol.equals("*")) {
            return b * a;
        }
        return b / a;
    }
}
