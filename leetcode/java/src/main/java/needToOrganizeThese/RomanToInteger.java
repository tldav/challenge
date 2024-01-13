package needToOrganizeThese;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class RomanToInteger {
    public static void main(String[] args) {
    
        Stack<Integer> meh = new Stack<>();
        
        meh.push(1);
        meh.push(2);
        meh.push(3);
    
        System.out.println(meh);
    
        System.out.println(meh.peek());
        
//        System.out.println(romanToInt("MCMXCIV"));
//        isLessThan("MCMXCIV");
    }
    
    public static int romanToInt(String str) {
        Map<Character, Integer> romanValues = new HashMap<>();
        
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int total = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int current = romanValues.get(str.charAt(i));
            if ( i + 1 < str.length() && romanValues.get(str.charAt(i)) < romanValues.get(str.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

}

// if current is lower than next char, subtract current from next char
// if current is higher than next char, add current to next char



