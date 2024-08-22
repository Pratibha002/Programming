package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveOccurrenceOfElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);  a.add(2);  a.add(1);  a.add(3);  a.add(1); a.add(4);  a.add(1);
        System.out.println("Original ArrayList: "+a);
        System.out.println("Enter the Element that we want to remove from ArrayList: ");
        int Element=sc.nextInt();
        HashSet<Integer>h= new HashSet<>();
        h.add(Element);
        ArrayList<Integer> finalList=new ArrayList<>();
        for(int i:a){
            if(!(h.contains(i))){
                finalList.add(i);
            }
        }
        System.out.println("ArrayList after removing the occurrence of the element: "+finalList);
        sc.close();

    }
}
