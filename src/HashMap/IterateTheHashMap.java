package HashMap;

import java.util.HashMap;

public class FrquencyCounting {
    public static void main(String[] args) {
        HashMap<Integer, String> h =new HashMap<>();
        h.put(23, "abc");
        h.put(43, "dsf");
        h.put(34,"pqr");
        h.put(90,"xyz");
        HashMap<Integer, Integer> frquency=new HashMap<>();
        
        for(int i : h.keySet()){
            System.out.println(i);
            frquency++;

        }
        System.out.println( frquency);
    }
}
