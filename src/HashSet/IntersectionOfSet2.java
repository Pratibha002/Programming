package HashSet;


import java.util.HashSet;

public class IntersectionOfSet2 {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(3);
        h.add(5);
        h.add(2);
        System.out.println("HashSet 1 : "+h);
        HashSet<Integer> h2= new HashSet<>();
        h2.add(5);
        h2.add(3);
        h2.add(7);
        System.out.println("HashSet 2 : "+h2);

        HashSet<Integer> intersectionSet= new HashSet<>(h);
        intersectionSet.retainAll(h2);
        System.out.println("Intersection (Common Elements from h1 & h2) : "+intersectionSet);


    }
}
