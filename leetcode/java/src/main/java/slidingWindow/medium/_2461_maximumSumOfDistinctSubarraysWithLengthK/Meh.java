package slidingWindow.medium._2461_maximumSumOfDistinctSubarraysWithLengthK;

import java.util.HashMap;
import java.util.Map;

public class Meh {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < nums.length - k + 1) {
            currentSum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if (map.size() == k) {
                maxSum = Math.max(currentSum, maxSum);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                currentSum -= nums[i];
                i++;
                j++;
            }
            
        }
        
        return maxSum;
    }
}
