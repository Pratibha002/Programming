package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SortArraylistAndRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(1); a.add(76); a.add(23); a.add(21); a.add(54); a.add(1); a.add(11);
        a.add(2); a.add(2); a.add(22);
        System.out.println("ArraList: "+a);

        Collections.sort(a);
        System.out.println("Sorted Arraylist: "+a);

        HashSet<Integer> h= new HashSet<>(a);
        System.out.println("Sorted and Unique HashSet: "+h);

    }
}
