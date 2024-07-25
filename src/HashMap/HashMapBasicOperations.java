package HashMap;

import java.util.HashMap;

public class HashMapBasicOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> h =new HashMap<>();
        h.put(23, "abc");//put operation==>to add the values
        h.put(43, "dsf");
        h.put(34,"pqr");
        h.put(90,"xyz");

        System.out.println(h);
        System.out.println(h.get(23));//get operation==>to get the specific key value
        System.out.println(h.entrySet());


        System.out.println(h.containsKey(45));
        System.out.println(h.containsKey(43));
        System.out.println(h.containsValue("ram"));
        System.out.println(h.containsValue("pqr"));

        System.out.println(h.remove(90));//To remove an item, use the remove() method and refer to the key:
        h.clear();
        System.out.println("clear() method clear/remove all the items/data"+h );

    }
}
