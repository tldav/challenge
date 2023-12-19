package stack;

import behavior.ToStringBehavior;
import stack.challenge.MinStack;

public class Main {
    public static void main(String[] args) {
        ToStringBehavior tsb = ToStringBehavior.getInstance();
        MinStack minStack = new MinStack();
        
        minStack.push(7);
        minStack.push(5);
        minStack.push(3);
        minStack.push(42);
        minStack.push(2);
        
        
        tsb.print(minStack.min());
        tsb.print(minStack.pop());
        tsb.print(minStack.min());
        tsb.print(minStack);
    }
}
