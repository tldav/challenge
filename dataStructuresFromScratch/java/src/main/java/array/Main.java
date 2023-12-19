package array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.print();
        array.insert(1);
        array.print();
        array.insert(2);
        array.print();
        array.insert(77);
        array.print();
        array.insert(4);
        array.print();
        array.insert(5);
        array.print();
        array.removeAt(2);
        array.print();
        array.insert(22);
        array.print();
        array.insert(88);
        array.print();
        System.out.println("Should be reverse");
        Array hi = array.reverse();
        hi.print();
        System.out.println("Should be reverse");
    
        System.out.println(array.max());

        Array otherArray = new Array(2);
        otherArray.insert(1);
        otherArray.insert(88);
        otherArray.insert(77);
        otherArray.insert(2);
        
        Array commonItems = array.intersect(otherArray);
        commonItems.print();
    }
    
}
