package array.easy._1929_ConcatenationOfArray;

class Solution {
    public int[] getConcatenation(int[] array) {
        int[] concat = new int[array.length * 2];
        
        for (int i = 0; i < array.length; i++) {
            concat[i] = array[i];
            concat[i + array.length] = array[i];
        }
        return concat;
    }
}