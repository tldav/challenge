package binarySearch.easy._374_GuessNumberHigherOrLower;

class Solution {
    private final int pick;
    
    public Solution(int pick) {
        this.pick = pick;
    }
    
    public int guessNumber(int right) {
        int left = 1;
        
        while (left <= right) {
//            int middle = (left + right) / 2;
            int middle = left + (right - left) / 2; // always calc middle this way in case of signed 32 bit int rollover
            if (guess(middle) == 0) {
                return middle;
            }
            if (guess(middle) == 1) {
                left = middle + 1;
            }
            if (guess(middle) == -1) {
                right = middle - 1;
            }
        }
        return 0;
    }
    
    private int guess(int myGuess) {
        return Integer.compare(pick, myGuess);
    }
    
}
