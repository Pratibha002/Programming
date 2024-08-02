package HashSet;

import java.util.HashSet;

public class checkIsSetEmpty {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("Is hashset empty? "+h.isEmpty());
        System.out.println("Is hashset empty? "+h2.isEmpty());

    }
}
