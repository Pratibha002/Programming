package HashSet;

import java.util.HashSet;

public class MultipleSetUniqueElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] a1 = {3, 4, 5, 6, 7};
        int[] a2 = {5, 6, 7, 8, 9};

        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int i : a){
            h.add(i);
        }
        System.out.println("SET 1 : " +h);
        for(int i : a1){
            h1.add(i);
        }
        System.out.println("SET 2 : " +h1);
        for(int i : a2){
            h2.add(i);
        }
        System.out.println("SET 3 : " +h2);
        HashSet<Integer> unionSet = new HashSet<>(h);
        unionSet.addAll(h1);
        unionSet.addAll(h2);
        System.out.println("UNION SET : "+unionSet);

    }
}
