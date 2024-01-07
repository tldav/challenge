package hash.implementation.easy._705_DesignHashSet;

class _705_DesignHashSet {
    public static void main(String[] args) {
        
        MyHashSet_CheatingWithArrayList set = new MyHashSet_CheatingWithArrayList();
        
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        set.contains(3);
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
//        set.contains(2);
        
        System.out.println(set);
    }
}
