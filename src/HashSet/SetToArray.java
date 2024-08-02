package HashSet;

import java.util.HashSet;
import java.util.LinkedList;

public class SetToArray {
    public static void main(String[] args) {
        HashSet<String> h =new HashSet<>();
        h.add("apple");
        h.add("mango");
        h.add("kiwi");
        h.add("banana");
        h.add("berries");
        System.out.println("Set : "+h);

        System.out.println("Array Elements : ");
        String [] s =h.toArray(new String[0]);
        for(String i : s){
            System.out.print(i+" ");
        }
        



    }
}
