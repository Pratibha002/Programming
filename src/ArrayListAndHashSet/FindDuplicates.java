package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1); a.add(2); a.add(1); a.add(11); a.add(4);
        a.add(3); a.add(11); a.add(2); a.add(5);

        System.out.println("ArrayList : "+a);

        HashSet<Integer> h =new HashSet<>();
        HashSet<Integer>duplicateElements  =new HashSet<>(h);

        for (Integer i:a){
            if(!h.add(i)){
                duplicateElements.add(i);
            }
        }
        System.out.println(h);
        System.out.println("Duplicate Elements : "+duplicateElements);


    }
}
//07314998602