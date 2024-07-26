package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddKeyIfNotExist {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> h =new HashMap<>();
        List<Integer> L=new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        List<Integer> L1=new ArrayList<>();
        L1.add(4);
        L1.add(5);
        L1.add(6);

        List<Integer> L3=new ArrayList<>();
        L3.add(7);
        L3.add(8);
        L3.add(9);

        h.put(1,L);
        h.put(2,L1);
        h.put(3,L3);

        System.out.println(h);

        List<Integer> L5=new ArrayList<>();
        L5.add(11);
        L5.add(22);
        L5.add(33);

        h.putIfAbsent(4,L5);
        System.out.println(h);
    }
}
