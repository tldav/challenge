package stack.easy._682_BaseballGame;

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (String command : operations) {
            if (command.equals("C")) {
                stack.pop();
            } else if (command.equals("+")) {
                int top = stack.pop();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
            } else if (command.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.parseInt(command));
            }
        }
        
        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}

// push commands:
// if int: push current int
// if '+': push current + stack.peek()
// if 'D': push stack.peek() * 2

// pop commands
// if 'C': pop() off of stack

