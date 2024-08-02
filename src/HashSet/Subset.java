package HashSet;

import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        int[]a ={1,2,3,4,5,6};
        int[]a1={3,4,5,6,7};

        HashSet<Integer> h =new HashSet<>();
        for(int i : a){
            h.add(i);
        }
        System.out.println(h);
        HashSet<Integer> h1 =new HashSet<>();
        for(int i : a1){
            h1.add(i);
        }
        System.out.println(h1);

        boolean subSet= h.containsAll(h1);
        System.out.println("SubSet of another set : "+subSet);
    }
}
