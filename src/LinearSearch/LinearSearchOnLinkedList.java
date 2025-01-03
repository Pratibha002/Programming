package LinearSearch;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearchOnLinkedList {
    public static void main(String[] args) {

        LinkedList<String> LL= new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add on the linked list: ");
        int n =sc.nextInt();

        System.out.println("Enter the elements: ");

        for (int i=0; i<n; i++){
            String element = sc.nextLine();
            LL.add(element);
        }
        System.out.println("Enter the element to find: ");
        String item =sc.nextLine();

//        int index =LL.linearSearch(item);
//
//        if (index!=-1){
//            System.out.println("Element found at position: "+index);
//        }else {
//            System.out.println("Element not found!!");
//        }

//        public int linearSearch(String target){
//
//        }
    }
}
