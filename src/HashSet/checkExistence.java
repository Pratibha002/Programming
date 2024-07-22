package HashSet;

import java.util.HashSet;

public class checkExistence {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("apple");
        h.add("banana");
        h.add("orange");
        System.out.println(h.contains("banana"));

    }
}
