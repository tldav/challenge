package stack.medium._155_MinStack;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private final List<Integer> items = new ArrayList<>();
    private final List<Integer> minItems = new ArrayList<>();
    
    public MinStack() {
    
    }
    
    public void push(int val) {
        this.items.add(val);
        
        if (!this.minItems.isEmpty() && this.getMin() < val) {
            this.minItems.add(this.getMin());
        } else {
            this.minItems.add(val);
        }
    }
    
    public void pop() {
        this.items.remove(this.items.size() - 1);
        this.minItems.remove(this.minItems.size() - 1);
    }
    
    public int top() {
        return this.items.get(this.items.size() - 1);
    }
    
    public int getMin() {
        return this.minItems.get(this.minItems.size() - 1);
    }

    @Override
    public String toString() {
        return this.items.toString();
    }
}