package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashSetIntoArrayList {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1); h.add(2); h.add(3); h.add(4); h.add(5);
        System.out.println("HahSet : "+h);

        ArrayList<Integer> a =new ArrayList<>(h);
        System.out.println("ArrayList : "+a);

    }
}
