package binarySearch.easy._278_FirstBadVersion;

class _278_FirstBadVersion {
    public static void main(String[] args) {
    
    }
}

/** Binary Search
 *
 * [0, 1, bad, 3, 4]
 *
 * Find middle of array
 *  if array[middle - 1] isn't bad && array[i] is bad
 *      return array[i]
 *  if array[middle - 1] is bad
 *      iterate through left half return first bad
 *  else
 *      iterate through right half and return first bad
 *
 */