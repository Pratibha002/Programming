package HashMap;

import java.util.HashMap;

public class DuplicateEntry {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(23,"abc");
        h.put(43,"dsf");
        h.put(34,"pqr");
        h.put(90,"xyz");
        h.put(90,"lmn");//hash map have the unique key if we attempt to put new entry with a key which exist
        // in the hashmap the new value associated with that key will overwrite the existing value.
        System.out.println(h);

       if(h.containsValue("xyz")){
           h.remove(90);
       }
        System.out.println(h);
    }
}
