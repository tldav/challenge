package neetToOrganizeThese;

import behavior.ToStringBehavior;

class PalindromeNumber {
    public static ToStringBehavior tsb = ToStringBehavior.getInstance();
    
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(121));
    }
    
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        StringBuilder reverseStr = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        return str.equals(reverseStr.toString());
        
    }
}
