package twoPointers.easy._26_RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        
        int left = 1;
        
        for (int num : array) {
            if (num > array[left - 1]) {
                array[left] = num;
                left += 1;
            }
        }
        return left;
    }
}
