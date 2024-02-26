package stack.medium._150_EvaluateReversePolishNotation;

class _150_EvaluateReversePolishNotation {
    public static void main(String[] args) {
//        String[] tokens = {"2", "1", "+", "3", "*"};
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(tokens));

        

    }
    
}
