package linkedList;

import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    
    // addFirst O(1)
    public void addFirst(T newValue) {
        Node<T> newFirst = new Node<>(newValue);
        if (this.isEmpty()) {
            this.first = newFirst;
            this.last = newFirst;
        } else {
            newFirst.next = this.first;
            this.first = newFirst;
        }
        this.size += 1;
    }
    
    // addLast O(1)
    public void addLast(T newValue) {
        Node<T> newLast = new Node<>(newValue);
        if (this.isEmpty()) {
            this.first = newLast;
        } else {
            this.last.next = newLast;
        }
        this.last = newLast;
        this.size += 1;
    }
    
    // deleteFirst O(1)
    public void removeFirst() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (this.first.equals(this.last)) { // first == last = size 1
            this.first = null;
            this.last = null;
        } else {
            Node<T> second = this.first.next;
            first.next = null; // unlinks first that's being removed
            this.first = second;
        }
        
        this.size -= 1;
    }
    
    // deleteLast O(n)
    public void removeLast() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        
        if (this.first.equals(this.last)) {
            this.first = null;
            this.last = null;
        } else {
            
            this.last = this.getPrevious(this.last);
            this.last.next = null;
        }
        this.size -= 1;
    }
    
    // contains O(n)
    public boolean contains(T value) {
        return this.indexOf(value) != -1;
    }
    
    // indexOf O(n)
    public int indexOf(T value) {
        if (this.first != null) {
            Node<T> current = this.first;
            int index = 0;
            while (current != null) {
                if (current.value.equals(value)) {
                    return index;
                }
                current = current.next;
                index += 1;
            }
        }
        return -1;
    }
    
    // size O(1) -> traversing list would be O(n)
    public int size() {
        return this.size;
    }
    
    // toArray O(n)
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        if (this.first != null) {
            Node<T> current = this.first;
            int index = 0;
            while (current != null) {
                arr[index] = current.value;
                current = current.next;
                index += 1;
            }
        }
        return arr;
    }
    
    public void reverse() {
        if (this.isEmpty()) {
            return;
        }
        Node<T> previous = this.first; // 10
        Node<T> current = this.first.next; // 20
        while (current != null) {
            Node<T> next = current.next; // 30
            current.next = previous; // reverse 20s link from 30 to 10
            previous = current; // previous = 20
            current = next; // current = 30
        }
//        Node<T> tempLast = this.last; <- is the same as previous
        this.last = this.first;
        this.last.next = null;
        this.first = previous;
    }
    
    public T getKthFromTheEnd(int k) {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        
        if (k == 1) {
            return this.last.value;
        }
        Node<T> target = this.first;
        Node<T> marker = this.first;
        int DISTANCE = k - 1;
        
        for (int i = 0; i < DISTANCE; i++ ) {
            marker = marker.next;
            if (marker == null) {
                throw new IllegalArgumentException();
            }
        }
        
        while (marker != this.last) {
            target = target.next;
            marker = marker.next;
        }
        return target.value;
    }
    
    public void print() {
        if (this.first != null) {
            Node<T> current = this.first;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
    }
    
    public T getMiddleNode() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        Node<T> middle = this.first;
        Node<T> end = this.first;
        
        while (end != this.last) {
            middle = middle.next;
            end = end.next.next;
        }
        
        return middle.value;
    }
    
    private boolean isEmpty() {
        return this.first == null;
    }
    
    private Node<T> getPrevious(Node<T> node) {
        Node<T> current = this.first;
        while (current != null) {
            if (current.next == this.last) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    private static class Node<T> {
        private final T value;
        private Node<T> next;
        
        public Node(T value) {
            this.value = value;
        }
    }
    
}

/*      *** My solution ***
 *     public T getKthFromTheEnd(int k) {
 *         if (this.isEmpty()) {
 *             throw new NoSuchElementException();
 *         }
 *
 *         if (k > this.size || k <= 0) {
 *             throw new IllegalArgumentException();
 *         }
 *
 *         if (k == 1) {
 *             return this.last.value;
 *         }
 *         int counter = k;
 *         Node<T> current = this.first;
 *         Node<T> target = this.first;
 *         while (current != null) {
 *             if (counter <= 0) {
 *                 target = target.next;
 *             }
 *             current = current.next;
 *             counter -= 1;
 *         }
 *         return target.value;
 *     }
 */