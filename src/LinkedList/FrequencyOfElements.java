package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the target Element : ");
        String target =sc.nextLine().toLowerCase();
        LinkedList<String> ll =new LinkedList<>();
        //with Objects .toLowerCase and .toUpperCase doesn't work
        //first String.valueOf(obj) do conversion then can use the uppercase ,lowercase methods

        ll.add("Mango");
        ll.add("Cherry");
        ll.add("Banana");
        ll.add("Apple");
        ll.add("Cherry");
        ll.add("Grapes");
        //String target="Cherry";
        int count=0;
        for (String list : ll) {
            if (list.toLowerCase().equals(target)) { // Compare ignoring case
                count++;
            }
        }
        System.out.println(count);
        /*

        //   LinkedList<Object> ll =new LinkedList<>();
        for (Object obj : ll) {
            String element = String.valueOf(obj); // Convert object to string representation
            if (element.toLowerCase().equals(target)) { // Compare ignoring case
                count++;
            }
        }
         */


    }
}
