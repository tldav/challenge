package hash.implementation.easy._705_DesignHashSet;

class MyHashSet_LinkedList_Correct {
    Node head = null;
    
    public void add(int key) {
        if (head == null) {
            head = new Node(key);
            return;
        }
        boolean doesExists = contains(key);
        if (!doesExists) {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            
            temp.next = new Node(key);
        }
    }
    
    public void remove(int key) {
        if (head == null) return;
        if (head.value == key) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.value == key)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
    }
    
    public boolean contains(int key) {
        if (head == null) return false;
        if (head.value == key) return true;
        
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.value == key) return true;
            temp = temp.next;
        }
        return false;
    }
    
    private class Node {
        Node next;
        int value;
        
        public Node(int key) {
            this.next = null;
            this.value = key;
        }
    }
}
