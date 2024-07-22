package HashSet;

import java.util.HashSet;

public class SizeAndClear {
    public static void main(String[] args) {
        HashSet<Double> h=new HashSet<>();
        h.add(1.1);
        h.add(2.2);
        h.add(3.3);
        h.add(4.4);
        h.add(5.5);
        System.out.println("Size of the HashSet : "+h.size());
        h.clear();
        System.out.println(h);
    }
}
