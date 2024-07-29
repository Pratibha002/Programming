package HashSet;

import java.util.HashSet;

public class IntersectionOfSets {
    public static void main(String[] args) {
        int []a ={89, 24, 75, 11, 23};
        int []b ={89, 2, 4};
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> intersectionSet=new HashSet<>();

        for(int i=0; i< a.length; i++){
            h.add(a[i]);
        }
        for(int j=0; j<b.length; j++){
            if(h.contains(b[j])){
                intersectionSet.add(b[j]);
            }
        }
        System.out.println("IntersectionSet  : "+intersectionSet);
        System.out.println("Size of IntersectionSet : "+intersectionSet.size());

    }
}
