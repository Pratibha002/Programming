package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(2);
        System.out.println("ArrayList : "+a);
        HashSet<Integer> h =new HashSet<>();
        for(int i:a){
            h.add(i);

        }System.out.println("After removing the duplicates: "+h);
    }
}
