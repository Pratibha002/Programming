package HashMapHashSet;

import java.util.HashSet;

public class commonElementsInTwoArrays {//by using only hashset
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int[] b={6,7,3,8,9,10};

        HashSet<Integer>h=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();

        for(int i :a){
            h.add(i);
        }
        System.out.println("SET 1: "+h);
        for(int i :b){
            h2.add(i);
        }
        System.out.println("SET 2: "+h2);

        HashSet<Integer>commonSet=new HashSet<>(h);
        commonSet.retainAll(h2);
        System.out.println("COMMON SET : "+commonSet);


    }
}
