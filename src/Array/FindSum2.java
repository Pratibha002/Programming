package Array;

import java.util.*;

public class FindSum2 {
    public static void main(String[] args) {
        int [] a=  {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        List<Integer>l =new ArrayList<>();
        for(Integer i :a) {
            l.add(i);
        }

        Collections.sort(l);
        System.out.println("Sorted List: "+l);
        List<List<Integer>> pairs =new ArrayList<>();
        int left =0;
        int right= l.size()-1;

        while (left<right){
            List<Integer> pair = new ArrayList<>();
            if(l.get(left)+l.get(right)==0){
                pair.add(l.get(left));
                pair.add(l.get(right));
                pairs.add(pair);
                left++;
                right--;
            }else if(l.get(left)+l.get(right)<0){
                left++;

            }else {
                right--;
            }
        }
        System.out.println("Pairs with sum zero: "+pairs);
    }
}
