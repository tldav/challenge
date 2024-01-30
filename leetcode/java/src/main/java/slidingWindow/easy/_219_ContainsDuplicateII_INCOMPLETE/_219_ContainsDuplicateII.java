package slidingWindow.easy._219_ContainsDuplicateII_INCOMPLETE;

class _219_ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
    
        Solution solution = new Solution();
        
        solution.containsNearbyDuplicate(arr, 2);
    }
}

/**
 * Right always increments
 * Left only increments when window becomes larger than k;
 *  Remove set[left] before incrementing, which updates the leftmost in window
 *
 *
 *
 *
 * [1, 2, 3, 1] k =3
 *
 *  window[left] = 1
 *  window[right] = 1
 *      is right - left > 3 ?
 *          no
 *      is arr[right] in window
 *          no
 *      window.add(arr[right])
 *
 *
 *
 */
