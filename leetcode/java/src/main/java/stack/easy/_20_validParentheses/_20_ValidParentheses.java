package stack.easy._20_validParentheses;

import behavior.ToStringBehavior;

class _20_ValidParentheses {
    private static final ToStringBehavior tsb = ToStringBehavior.getInstance();
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        tsb.print(solution.isValid("()[]{}"));
        tsb.print(solution.isValid("]})"));
        tsb.print(solution.isValid("{{()}}"));
        tsb.print(solution.isValid("(){}}{"));

    }
}
