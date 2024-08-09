package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveOccurrenceOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);  a.add(2);  a.add(1);  a.add(3);  a.add(1); a.add(4);  a.add(1);
        System.out.println("ArrayList: "+a);
        HashSet<Integer>h= new HashSet<>(a);
        System.out.println("Hashset: "+h);

    }
}
