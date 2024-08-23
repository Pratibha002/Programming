package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
    public static void main(String[] args) {
        ArrayList<String>a =new ArrayList<>();
        a.add("a"); a.add("b"); a.add("c"); a.add("d");
        System.out.println("Original List: "+a);

        Collections.reverse(a);
        System.out.println("Reverse List: "+a);


        //=======we can write it as=================
//        ArrayList<String>a =new ArrayList<>(Arrays.asList("a","b","c","d"));
//
//
    }
}
