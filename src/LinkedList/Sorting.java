package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Sorting {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Mango");
        ll.add("Cherry");
        ll.add("Banana");
        ll.add("Papaya");
        ll.add("Apple");
        ll.add("Pear");
        ll.add("Orange");
        ll.add("Kiwi");
        System.out.println("Before sorting : "+ll);
        Collections.sort(ll);
        System.out.println("After  sorting in ascending order : "+ll);
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println("After  sorting in descending order : "+ll);


    }
}
