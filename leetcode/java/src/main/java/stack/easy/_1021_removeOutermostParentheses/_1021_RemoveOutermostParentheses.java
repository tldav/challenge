package stack.easy._1021_removeOutermostParentheses;

import behavior.ToStringBehavior;

public class _1021_RemoveOutermostParentheses {
    /** PRIMITIVE
     * starts with ( and doesn't end until first ( is closed
     * ((())) <- primitive
     * ((())) + () = ((()))()
     *   A    +  B = valid parentheses string
     * Primitive is a self-contained and self-closing valid paren string
     */
    private static final ToStringBehavior tsb = ToStringBehavior.getInstance();
    public static void main(String[] args) {
        
        Solution solution = new Solution();
    
        tsb.print(solution.removeOuterParentheses("((()))()()"));
        // (()())(())
        // ((()))()()
    }
}
