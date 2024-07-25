package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IterateTheHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> h =new HashMap<>();
        h.put(23, "abc");
        h.put(43, "dsf");
        h.put(34,"pqr");
        h.put(90,"xyz");


        for(Map.Entry<Integer,String> i : h.entrySet()){
            System.out.println("Key : "+i.getKey()+" , Value : "+i.getValue());
        }
        //In Java, Map.Entry is an inner interface of the Map interface.
        // It represents a key-value pair within a Map. Key and Value collectively callled as 'Entry'
        // This interface provides methods to retrieve both the key and the value associated with that entry.

        h.forEach((k,v) -> {System.out.println(k + "->" + v);});

    }
}
