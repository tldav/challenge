package binarySearch.easy._374_GuessNumberHigherOrLower;

class _374_GuessNumberHigherOrLower {
    public static void main(String[] args) {
        Solution solution = new Solution(1702766719);
        System.out.println(solution.guessNumber(2126753390));
    }
}

/**
 * len = 16
 * target = 15
 * [0, 1, 2, 3, 4, 5, 6, 7, 8,
 *              9, 10, 11, 12, 13, 14, 15]
 *
 * left = 0
 * right = 15
 *
 * middle = left + right / 2
 * middle = 8
 *
 * alt version
 * (15R - 0L) / 2 = 8
 * + 0L = 8
 *
 *
 * middle = L + R.... 9 + 15
 *  res 24 / 2 = 12 --- middle = 12
 *
 *  alt version
 *
 *  (15R - 9L) = 6
 *      res 6 / 2 = 3...add left, which is 9
 *      middle = 12.
 *
 *
 */