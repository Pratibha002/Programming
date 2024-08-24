package LinkedList;

import java.util.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1); ll.add(2); ll.add(3); ll.add(13); ll.add(9); ll.add(10); ll.add(3);
        ll.add(18); ll.add(45); ll.add(55); ll.add(8);ll.add(88);
        System.out.println(ll);
        System.out.println("Size of the linkedlist: "+ll.size());
        int midIndex=(ll.size()/2);

        int middleElement=ll.get(midIndex);
        System.out.println("Middle Element: "+middleElement);




    }

}
