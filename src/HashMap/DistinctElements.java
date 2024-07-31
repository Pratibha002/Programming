package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DistinctElements {
    public static void main(String[] args) {
        int [] a = {1,4,1,2,3,4,3,5,5};
        HashMap<Integer,Boolean>h = new HashMap<>();
        for(Integer i:a){
           h.put(i,true);

        }
        System.out.println("Distinct Elements : ");

        for (Map.Entry<Integer,Boolean> i :h.entrySet()){
            System.out.print(i.getKey()+" ");
        }
    }
}
