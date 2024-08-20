package HashMapHashSet;

import java.util.*;


public class RemoveDuplicateElements2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 5};
        int[] array2 = {4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 1};

        List<int [] >l= Arrays.asList(array1,array2,array3);
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> uniqueSet =new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] i:l){
           for(int num: i){
               map.put(num, map.getOrDefault(num,0)+1);
               set.add(num);
           }
        }
        System.out.println("Occurrence of numbers: "+map);
        System.out.println("Set values: "+set);


        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()==1){
                uniqueSet.add(i.getKey());
            }
        }
        System.out.println("Unique set (Elements that appear exactly once across all arrays) : "+uniqueSet);






    }
}
