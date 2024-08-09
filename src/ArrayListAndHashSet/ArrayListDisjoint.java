package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDisjoint {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("First ArrayList: "+a);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        System.out.println("First ArrayList: "+a1);

        HashSet<Integer> h =new HashSet<>(a);
        boolean disjoint=true;
        for(Integer i : a1){
            if(h.contains(i)){
                disjoint=false;
            }
        }
        System.out.println("Are the ArrayLists disjoint? " + disjoint);

    }
}
