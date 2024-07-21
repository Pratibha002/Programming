package LinkedList;

import java.util.LinkedList;

public class Searching {
    public static void main(String[] args) {
        LinkedList<Double> ll =new LinkedList<>();
        ll.add(1.1);
        ll.add(2.2);
        ll.add(3.3);
        ll.add(4.4);
        ll.add(5.15);
        ll.add(6.6);
        ll.add(7.7);
        if(ll.contains(3.3)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

    }
}
