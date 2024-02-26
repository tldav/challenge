package stack.medium._853_CarFleet;

import java.util.NavigableMap;
import java.util.Stack;
import java.util.TreeMap;

class Solution {
    public int carFleet(int target, int[] positions, int[] speeds) {
        Stack<Double> stack = new Stack<>();
        
        NavigableMap<Integer, Integer> cars = new TreeMap<>();
        for (int i = 0; i < positions.length; i++) {
            cars.put(positions[i], speeds[i]);
        }
        
        for (int position : cars.descendingMap().keySet()) {
            double speed = cars.get(position);
            double steps = (target - position) / speed;
            if (stack.isEmpty() || stack.peek() < steps) {
                stack.push(steps);
            }
        }
        
        return stack.size();
    }
}