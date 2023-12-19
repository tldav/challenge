package queue;

import queue.ArrayQueue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enqueue(10);
        System.out.println(queue.getRear());
        queue.enqueue(20);
        System.out.println(queue.getRear());
        queue.enqueue(30);
        System.out.println(queue.getRear());
        queue.enqueue(40);
        System.out.println(queue.getRear());

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

    }
}
