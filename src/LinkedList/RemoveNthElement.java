package LinkedList;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthElement {
    public static void main(String[] args) {

        LinkedList<String>ll=new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        System.out.println("List of the elements: "+ll);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the nth Element: ");
        int nElement= sc.nextInt();
        if(nElement<=0 && nElement>=ll.size()){

            System.out.println("Invalid nth element/ invalid index : "+nElement);
        }else {
            ll.remove(nElement);
            System.out.println("Updated List"+ll);
        }

    }
}
