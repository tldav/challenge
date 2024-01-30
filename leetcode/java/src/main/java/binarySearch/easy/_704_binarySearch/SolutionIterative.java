package binarySearch.easy._704_binarySearch;

class SolutionIterative {
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            //            int middle = (left + right) / 2;
            int middle = left + (right - left) / 2; // always calc middle this way in case of signed 32 bit int rollover
            if (target == array[middle]) {
                return middle;
            }
            
            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
