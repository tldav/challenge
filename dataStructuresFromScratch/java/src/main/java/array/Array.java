package array;

@SuppressWarnings("ManualArrayCopy")
public class Array {

    private int[] items;
    private int count;
    
    public Array(int length) {
        this.items = new int[length];
    }
    
    public void insert(int item) {
        if (this.items.length == this.count) {
            int[] temp = new int[this.count * 2];
            for (int i = 0; i < this.count; i++) {
                temp[i] = this.items[i];
            }
            this.items = temp;
        }
        this.items[this.count] = item;
        this.count += 1;
    }
    
    public void removeAt(int index) {
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < this.count; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.count--;
    }
    
    public int indexOf(int item) {
        /*       Runtime complexity: O(n)
         * Best case scenario runtime complexity
         *  O(1) <- item arg is at index 0
         * Worst case scenario runtime complexity
         *  O(n) <- item arg is the final element
         */
        for (int i = 0; i < this.count; i++) {
            if (this.items[i] == item) {
                return i;
            }
        }
        return -1;
    }
    
    // Exercises
    public int max() { // O(n) bc the largest might be the final element.
        int largest = 0;
        for (int i = 0; i < this.count; i++) {
            if (this.items[i] > largest) {
                largest = this.items[i];
            }
        }
        return largest;
    }
    
    public Array intersect(Array arr) {
        Array commonItems = new Array(1);
        for (int i = 0; i < arr.count; i++) {
            for (int j = 0; j < this.count; j++) {
                if (arr.items[i] == this.items[j]) {
                    commonItems.insert(arr.items[i]);
                }
            }
        }
        return commonItems;
    }
    
    public Array reverse() {
        Array reversed = new Array(1);
        for (int i = this.count; i > 0; i-- ) {
            reversed.insert(this.items[i - 1]);
        }
        return reversed;
    }
    
    
    public void print() {
        StringBuilder toPrint = new StringBuilder();
        for (int i = 0; i < this.count; i++) {
            toPrint.append(this.items[i]).append(", ");
        }
        System.out.println(toPrint);
    }
    
    public int length() {
        return this.count;
    }
}

