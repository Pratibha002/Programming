package LinkedList;

import java.util.LinkedList;

public class InsertionInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.addFirst(6);
        System.out.println(ll);
        ll.addLast(6);
        System.out.println(ll);
        ll.addLast(9);
        System.out.println(ll);

    }
}
