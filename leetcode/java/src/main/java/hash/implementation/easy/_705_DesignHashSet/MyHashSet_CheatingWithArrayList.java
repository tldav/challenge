package hash.implementation.easy._705_DesignHashSet;

import java.util.ArrayList;
import java.util.List;

class MyHashSet_CheatingWithArrayList {
    
    public MyHashSet_CheatingWithArrayList() {
    
    }
    
    List<Integer> list = new ArrayList<>();
    
    public void add(int key) {
        if (!this.contains(key)) {
            list.add(key);
        }
    }
    
    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                list.remove(i);
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        for (int item : this.list) {
            if (item == key) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return this.list.toString();
    }
}
