package array.easy._724_FindPivotIndex._1991_FindTheMiddleIndexInArray;

class Solution {
    public int findMiddleIndex(int[] array) {
        int leftSum = 0;
        int rightSum = 0;
    
        for (int num : array) {
            rightSum += num;
        }
    
        for (int i = 0; i < array.length; i++) {
            rightSum -= array[i];
            System.out.println("iteration: " + i + ", leftSum = " + leftSum + ", rightSum = " + rightSum);
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += array[i];
        }
    
        return -1;
    }
}
