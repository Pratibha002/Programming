package HashSet;

import java.util.HashSet;

public class IntersectionOfSets {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("Hashset"+h);
        HashSet<Integer> h2=new HashSet<>();
        h2.add(3);
        h2.add(2);
        h2.add(4);
    }
}
