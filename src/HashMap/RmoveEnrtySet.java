package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RmoveEnrtySet {
    public static void main(String[] args) {
        HashMap<Integer,List<Integer>> h =new HashMap<>() ;
        HashMapKeyValue obj =new HashMapKeyValue();
        List<Integer> l=obj.table(2);
        List<Integer> l1=obj.table(3);
        List<Integer> l2=obj.table(4);

        h.put(2,l);
        h.put(3,l1);
        h.put(4,l2);

        System.out.println(h);

            if(h.containsKey(4)){
                h.remove(4);
            }

        System.out.println("Updated hashmap"+h);

    }
    public List<Integer> table(Integer value){
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1; i<=10; i++){
            a.add(value*i);
        }
        return a;
    }
}
