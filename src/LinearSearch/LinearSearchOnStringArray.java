package LinearSearch;

import java.util.Scanner;

public class LinearSearchOnStringArray {
    public static  void  main(String[] args){
        int i;
        boolean found=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements do you want to enter: ");
        int n =sc.nextInt();
        sc.nextLine();// consume the leftover newline
        String [] a = new String[n];

        System.out.println("Enter the elements: ");

        for ( i=0; i<n; i++){
            a[i]=sc.nextLine();
        }
        System.out.println("Enter the item to find: " );
        String item= sc.nextLine();

        for ( i=0; i<a.length; i++){
            if (a[i].equals(item)){
                found =true;
                break;
            }
        }
        if (found){
            System.out.println("Element found at index position: "+i);
        }else {
            System.out.println("Element not found!!");
        }
    }
}
