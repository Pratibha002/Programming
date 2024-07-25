package HashMap;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> h =new HashMap<>();
        h.put(100,"ABC");
        h.put(50,"PQR");
        h.put(120,"XYZ");
        h.put(20,"LMN");
        System.out.println(h);

        System.out.println(h.put(100,"ABHI"));

        Collections c = (Collections) h.values();
        System.out.println(c);

        Set s1 =h.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1= (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"......................"+m1.getValue());
            if(m1.getKey().equals("ABC")){
                m1.setValue("Abhi");
            }
        }
        System.out.println(h);

    }
}
