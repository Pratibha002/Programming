package HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class commonElementsInTwoArrays2 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int[] b={6,7,3,8,9,10};

        HashMap<Integer,Integer> hmap=new HashMap<>();
        HashMap<Integer,Integer> hmap2=new HashMap<>();
        HashSet<Integer>hset=new HashSet<>();

        for(int i :a){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        for(int i :b){
           if(hmap.containsKey(i)){
               hset.add(i);
           }
        }
        System.out.println("Common Elements: "+hset);



    }

}
