package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        ArrayList<Object> al2 = new ArrayList<>();
        al.add(100);
        al.add(23);
        al.add(3);
        al.add(4);
        al.add(1);
        al.add(8);
        al.add(33);
        Collections.sort(al);
        System.out.println("Sorted ArrayList in ascending order : "+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Sorted ArrayList in descending order : "+al);

//        al2.add(3,"Cat");
//        al2.add(1,"Apple");
//        al2.add(4,"Dog");
//        al2.add(2,"Ball");
//        Collections.sort(al2);
/*
Comparable Interface: Used to define the natural ordering of objects.
It's suitable when you always want to sort objects in a specific way.

Comparator Interface: Provides flexibility for sorting objects in different ways.
You can create custom comparators for complex sorting criteria or when the natural ordering doesn't fit your needs.
 */




    }
}
