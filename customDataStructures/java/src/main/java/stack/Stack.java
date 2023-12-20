package stack;

import java.util.*;

@SuppressWarnings({"unchecked"})
public class Stack<T> {
    protected T[] array;
    protected int size;
    
    public Stack() {
        array = (T[]) new Object[0];
    }
    
    protected Stack(T[] input) {
        array = input;
        size = array.length;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public T push(T item) {
        if (isFull()) {
            int newSize = size == 0 ? 1 : size * 2;
            T[] newArray = (T[]) new Object[newSize];
            if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = item;
        size += 1;
        return item;
    }
    
    public T pop() {
        throwIfStackEmpty();
        T removedItem = array[size - 1];
        size -= 1;
        return removedItem;
    }
    
    public T peek() {
        throwIfStackEmpty();
        return array[size - 1];
    }
    
    protected boolean isFull() {
        return array.length == size;
    }
    
    private void throwIfStackEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
    
    @Override
    public String toString() {
        List<String> meh = new Vector<>();
        T[] copy = Arrays.copyOfRange(array, 0, size);
        return Arrays.toString(copy);
    }
    
    
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Stack<?> stack = (Stack<?>) o;
//        return size == stack.size && Arrays.equals(array, stack.array);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(size);
//        result = 31 * result + Arrays.hashCode(array);
//        return result;
//    }
}
