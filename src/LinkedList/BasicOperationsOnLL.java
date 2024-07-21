package LinkedList;

import java.util.LinkedList;

public class BasicOperationsOnLL {
    public static void main(String[] args) {
        LinkedList <Object> ll =new LinkedList<>();
        LinkedList <Object> ll3 =new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(1.1);
        ll.add(2.2);
        ll.add(5.15);
        ll.add('a');
        ll.add('d');
        ll.add("Mango");
        ll.add("Cherry");
        ll.add("Banana");

        System.out.println("LinkedList3 is empty? : "+ll3.isEmpty());
        System.out.println("LinkedList is empty? : "+ll.isEmpty());

        System.out.println("Original list: "+ll);

        ll.set(9,"Orange");
        System.out.println("Modified List : "+ll);

        System.out.println("Modified subList : "+ ll.subList(1,3));

        ll.remove(7);
        System.out.println("Modified List : "+ll);

        LinkedList <Object> ll2 =new LinkedList<>();
        ll2.add(2.4);
        ll2.add(5.1);
        ll2.add('b');
        ll2.add('e');
        LinkedList <Object> ll4 =new LinkedList<>(ll2);
        System.out.println("Concatenated String : "+ll4);


     }
}
