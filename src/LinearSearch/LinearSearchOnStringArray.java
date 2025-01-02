package LinearSearch;

import java.util.Scanner;

public class LinearSearchOnArray {
    public static  void  main(String[] args){
        int i;
        boolean found=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements do you want to enter: ");
        int n =sc.nextInt();
        int [] a = new int[n];

        System.out.println("Enter the elements: ");

        for ( i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the item to find: " );
        int item= sc.nextInt();

        for ( i=0; i<a.length; i++){
            if (a[i]==item){
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
