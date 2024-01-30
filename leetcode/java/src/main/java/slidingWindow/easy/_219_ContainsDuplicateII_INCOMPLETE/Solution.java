package slidingWindow.easy._219_ContainsDuplicateII_INCOMPLETE;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        List<Integer> window = new ArrayList<>();
        int left = 0;
        
        for (int right : arr) {
            if (right - left > k) {
                window.remove(left);
                left += 1;
            }
            if (window.contains(right)) {
                return true;
            }
                System.out.println("this runs?");
            System.out.println(window);
            window.add(right);
        }
        System.out.println(window);
        return false;
    }
}
