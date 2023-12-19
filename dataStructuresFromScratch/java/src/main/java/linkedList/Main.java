package linkedList;

import behavior.ToStringBehavior;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToStringBehavior tsb = ToStringBehavior.getInstance();
    
        LinkedList<Integer> list = new LinkedList<>();

//        list.addFirst(10);
//        list.addFirst(5);
//        list.addFirst(16);
//        list.addLast(34);
//        list.addFirst(72);
//        list.addLast(900);
        // [72, 16, 5, 10, 34, 900]
    
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        //  3
        // [10, 20, 30, 40, 50]
        //           *       *
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(3));
    
        System.out.println(list.getMiddleNode());
        
    }
    
}
