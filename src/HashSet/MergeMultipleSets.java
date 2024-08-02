package HashSet;

import java.util.HashSet;

public class MergeMultipleSets {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("FIRST SET : "+h);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        System.out.println("SECOND SET : "+h1);
        h2.add(5);
        h2.add(6);
        h2.add(7);
        System.out.println("THIRD SET : "+h2);
        HashSet<Integer> merge= new HashSet<>(h);
        merge.addAll(h1);
        merge.addAll(h2);
        System.out.println("Collections of all sets (Merged sets): " +merge);



    }
}
