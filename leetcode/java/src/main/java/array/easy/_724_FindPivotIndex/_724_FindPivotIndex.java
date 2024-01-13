package array.easy._724_FindPivotIndex;

class _724_FindPivotIndex {
    public static void main(String[] args) {
        
        int[] array = {1, 7, 3, 6, 5, 6};
    
        Solution solution = new Solution();
    
        System.out.println(solution.pivotIndex(array));
    }
}

/**
 * @ index 0
 * left = 0
 * right = 27
 *
 * @ index 2
 * left = 1
 * right = 20
 *
 * [ 1, 7, 3, 6, 5, 6 ]
 *
 *   left starts at 0;
 *   end of every iteration, left += array[i]
 *
 *   right starts at 28;
 *   beginning of every iteration, right = right - left - current
 *
 *
 */