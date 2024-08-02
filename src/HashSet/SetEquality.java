package HashSet;

import java.util.HashSet;

public class SetEquality {
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();
        HashSet<Integer>h3=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("SET 1 : "+h);
        h2.add(1);
        h2.add(2);
        h2.add(3);
        System.out.println("SET 2 : "+h2);
        h3.add(11);
        h3.add(22);
        h3.add(3);
        System.out.println("SET 3 : "+h3);
        System.out.println("SET 1 EQUALS TO THE SET 2 ?"+h.equals(h2));
        System.out.println("SET 2 EQUALS TO THE SET 3 ?"+h2.equals(h3));
        System.out.println("SET 1 EQUALS TO THE SET 3 ?"+h.equals(h3));
    }
}
