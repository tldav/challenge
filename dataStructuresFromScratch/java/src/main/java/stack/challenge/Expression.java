package stack.challenge;

import stack.Stack;

import java.util.Map;


public class Expression {
    private final Stack<Character> charStack = new Stack<>();
    private final Map<Character, Character> bracketMap = Map.of(
            '(', ')',
            '[', ']',
            '{', '}',
            '<', '>'
    );
    private final String input;
    
    private Expression(String input) {
        this.input = input;
    }
    
    public static Expression getInstance(String input) {
        return new Expression(input);
    }
    
    public boolean isValid() {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        if (input.equals("")) {
            return false;
        }
        for (char character : input.toCharArray()) {
            if (isOpenBracket(character)) {
                charStack.push(character);
            }
            if (isClosingBracket(character)) {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if (!bracketsMatch(top, character)) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
    
    private boolean bracketsMatch(char openBracket, char closeBracket) {
        return bracketMap.get(openBracket) == closeBracket;
    }
    
    private boolean isOpenBracket(char character) {
        return bracketMap.containsKey(character);
    }
    
    private boolean isClosingBracket(char character) {
        return bracketMap.containsValue(character);
    }
}
