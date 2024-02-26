package stack.medium._739_DailyTemperatures;

import java.util.Stack;

class Solution {
    

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] map = new int[T.length];
        
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int topIndex = stack.pop();
                int diff = i - topIndex;
                map[topIndex] = diff;
            }
            stack.push(i);
        }
        return map;
    }
}

