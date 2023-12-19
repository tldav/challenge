package stack.challenge;


import stack.Stack;

public class StringReverser {
    
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> charStack = toCharStack(input);
        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append(charStack.pop());
        }
        return reversed.toString();
    }
    
    private Stack<Character> toCharStack(String str) {
        Stack<Character> charStack= new Stack<>();
        for (char character : str.toCharArray() ) {
            charStack.push(character);
        }
        return charStack;
    }
    
}
