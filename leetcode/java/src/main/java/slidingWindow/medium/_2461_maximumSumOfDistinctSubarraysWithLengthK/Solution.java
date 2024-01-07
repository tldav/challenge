package slidingWindow.medium._2461_maximumSumOfDistinctSubarraysWithLengthK;

class Solution {
    // Input: nums = [1, 5, 4, 2, 9, 9, 9], k = 3
    // Expect: 15
    
    // [4, 4, 4]
    
    public long maximumSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        
        int windowStart = 0;
        int windowEnd = k - 1;
        int finalCycleIndex = nums.length - k;
        int tempSum = 0;
        for (int i = windowStart; i < k; i ++) {
            tempSum += nums[i];
            windowStart ++;
        }
        
        
        for (int i = 0; i < finalCycleIndex; i++) {
            if (nums[i] == 69) System.out.println("poop");
            if (i < k) {
                maxSum += nums[i];
            } else {
                System.out.println("num at last index: " + nums[i]);
                maxSum += nums[i] - nums[i - k];
            }
    
            System.out.println("max sum: " + maxSum);
        }

        return maxSum;
    }
    
    
    // sum the first 3 elements: 1 + 5 + 4 = 10
    // shift + 1 and add new end: 10 + 2 = 12
    // subtract element that was left behind: 10 - 1 = 11
}
