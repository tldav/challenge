package array.easy._303_RangeSumQueryImmutable;

class NumArray {
    
    private final int[] array;
    
    public NumArray(int[] array) {
        this.array = array;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
            sum += this.array[i];
        }
        
        return sum;
    }
}
