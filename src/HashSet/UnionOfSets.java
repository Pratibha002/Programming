package HashSet;

import java.util.HashSet;

public class UnionOfSets {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("Hashset"+h);
        HashSet<Integer> h2=new HashSet<>(h);
        h2.add(4);
        h2.add(5);
        h2.add(6);
        System.out.println("Hashset2"+h2);




    }
}
