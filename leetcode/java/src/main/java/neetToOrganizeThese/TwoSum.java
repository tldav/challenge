package neetToOrganizeThese;

import behavior.ToStringBehavior;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static ToStringBehavior tsb = ToStringBehavior.getInstance();
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        tsb.print(twoSum(nums, 6));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[i] == nums[j]);
                if (nums[i] + nums[j] == target && i != j) {
                    array[0] = i;
                    array[1] = j;
                    break;
                }
            }
        }
        
        return array;
    }
    
}
