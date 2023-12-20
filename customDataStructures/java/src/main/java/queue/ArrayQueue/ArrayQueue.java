package queue.ArrayQueue;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int count;
    private int front;
    private int rear;
    
    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
    }
    // enqueue ****ADDS TO REAR****
    // dequeue ****REMOVES FROM FRONT****
    
    public void enqueue(int item) {
        if (this.isFull()) {
            throw new IllegalStateException();
        }
        this.items[this.rear++] = item;
        this.count++;
    }
    
    public int dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException();
        }
        int item = items[front];
        this.items[front++] = 0;
        this.count--;
        return item;
    }
    
    public int getFront() {
        return front;
    }
    
    public int getRear() {
        return rear;
    }
    
    public int peek() {
        if (!this.isEmpty()) {
            return this.front;
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return this.count <= 0;
    }
    
    public boolean isFull() {
        return this.count >= this.items.length;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
