package stack.challenge;

import stack.Stack;

public class MinStack extends Stack<Integer> {
    
    private int minValue;
    
    MinStack(Integer[] input) {
        super(input);
        minValue = input[0];
        for (int num : input) {
            if (num < minValue) {
                minValue = num;
            }
        }
    }
    
    public MinStack() {
        super();
    }
    
    // [5, 2, 10, 1]
    // next x5 ... stack isEmpty, push 5
    //   minValue = 5, stack [5]
    // next x = 2
    //   insert 2 * x2 - 5 = -1
    //   minValue = x2
    // next x10
    //   insert x10
    //   minValue = 2
    // next x1
    //   insert 2 * x1 - 2 = 0
    //   minValue = x1
    //
    // stack = [5, -1, 10, 0]
    // minValue = 1
    
    // next y = 0
    //   minValue = 2
    public int min() {
        return minValue;
    }
    
    // if x >= minValue
    //   insert x
    // if x < minvalue
    //   insert 2 * x - minValue
    //   minValue = x
    @Override
    public Integer push(Integer item) {
        if (isEmpty()) {
            minValue = item;
            super.push(item);
        }
        if (item >= minValue) {
            super.push(item);
        } else {
            super.push(2 * item - minValue);
            minValue = item;
        }
        return item;
    }
    
    // if y >= minValue
    //   minValue = minValue
    // if y < minValue
    //   minValue = 2 * minValue - y
    @Override
    public Integer pop() {
        int top = super.pop();
        if (top < minValue) {
            minValue = 2 * minValue - top;
        }
        return top;
    }
}
