package HashSet;

import java.util.HashSet;

public class ArrayToSet {
    public static void main(String[] args) {
        String [] s ={"banana", "apple", "kiwi", "berries"," mango"};
        System.out.println("Array : ");
        for(String i : s){
            System.out.print(i+" ");
        }

        System.out.println("Array"+s);
        HashSet<String> h =new HashSet<>();
        for(String i: s){
            h.add(i);

        }
        System.out.println("Set : "+h);
    }
}
