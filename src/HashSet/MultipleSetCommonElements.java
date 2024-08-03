package HashSet;

import java.util.HashSet;

public class MultipleSetCommonElements {
    public static void main(String[] args) {
        int [] a ={1,2,3};
        int [] a1 ={3,4,5};
        int [] a2 ={5,3,7};
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

       for (int i : a){
          h.add(i);
       }
        System.out.println("FIRST SET : "+h);
        for (int i : a1){
            h1.add(i);
        }
        System.out.println("SECOND SET : "+h1);
        for (int i : a2){
            h2.add(i);
        }
        System.out.println("THIRD SET : "+h2);
        HashSet<Integer> commonElements=new HashSet<>(h);

        commonElements.retainAll(h1);
        commonElements.retainAll(h2);


        System.out.println(commonElements);






    }
}
