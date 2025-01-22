package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIterativeMethod {
    public static void main(String[] args) {
        //for binary search array must be sorted.
       // int [] a ={1,2,3,4,5,6,7,8,9,10};
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements to be insert: ");
        int n =sc.nextInt();
        int [] a =new int[n];
        System.out.println("Enter the elements: ");

        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted Array : "+Arrays.toString(a));
        System.out.println("Enter the item to find: ");
        int item = sc.nextInt();

        int low=0;
        int high= a.length-1;
        int mid = (low+high)/2;

        while (low<=high){
            if (a[mid]==item){
                System.out.println("Element found at position: "+mid);
                break;
            } else if (a[mid]<item) {
                low=mid+1;
            }else {
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if (low>high){
            System.out.println("Element not found!!");
        }

    }
}
