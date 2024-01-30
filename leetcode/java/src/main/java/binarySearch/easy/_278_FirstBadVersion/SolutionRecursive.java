package binarySearch.easy._278_FirstBadVersion;

class SolutionRecursive {
    
    public int firstBadVersion(int n) {
        return firstBadVersion(n, 1, n);
    }
    
    public int firstBadVersion(int n, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = left + (right - left) / 2;
        if (!isBadVersion(middle - 1 ) && isBadVersion(middle)) {
            return middle;
        }
        if (isBadVersion(middle - 1)) {
            return firstBadVersion(n, left, right - 1);
        }
        return firstBadVersion(n, middle + 1, right);
    }
    
    
    
    
    private boolean isBadVersion(int version) {
        return true;
    }
}
