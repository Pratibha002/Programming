package HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        Integer [] a ={1,2,3,4,5,6,5};
        HashSet<Integer> h =new HashSet<>();
        h.addAll(List.of(a));
        System.out.println("unique elements: "+h);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:a) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println("occurence of  an elements: "+map);


        boolean hasDuplicate =false;
        System.out.println("Duplicate element: ");
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if (i.getValue()>1){
                System.out.println(i.getKey()+ " ");
                hasDuplicate=true;
            }

        } if (!hasDuplicate) {
            System.out.println("No duplicate element found.");
        }
    }
}
