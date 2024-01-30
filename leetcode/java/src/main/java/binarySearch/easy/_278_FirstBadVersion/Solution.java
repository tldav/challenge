package binarySearch.easy._278_FirstBadVersion;

class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            int middle = left + (right - left) / 2;
            
            if (!isBadVersion(middle - 1) && isBadVersion(middle)) {
                return middle;
            }
            if (isBadVersion(middle - 1)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            
        }
        
        return -1;
    }
    
    
    
    private boolean isBadVersion(int version) {
        return true;
    }
}
