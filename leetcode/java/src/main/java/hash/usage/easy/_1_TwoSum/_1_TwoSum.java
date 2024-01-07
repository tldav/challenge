package hash.usage.easy._1_TwoSum;

import java.util.Arrays;

class _1_TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        
        Solution solution = new Solution();
        
        int[] answer = solution.twoSum(array, 9);
    
        System.out.println(Arrays.toString(answer));
    }
    
}
