package array.easy._1929_ConcatenationOfArray;

import java.util.Arrays;

class _1929_ConcatenationOfArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] array = {1, 2, 3};
        
        int[] answer = solution.getConcatenation(array);
    
        System.out.println(Arrays.toString(answer));
        
//        SolutionAltSustainable solutionAlt = new SolutionAltSustainable();
//
//        int[] altAnswer = solutionAlt.getConcatenation(array, 3);
//
//        System.out.println(Arrays.toString(altAnswer));
        
    }
}
