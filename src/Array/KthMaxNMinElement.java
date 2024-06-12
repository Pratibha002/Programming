//Find the maximum and minimum element in an array
package Array;
import java.util.Arrays;
import java.util.Scanner;
public class KthMaxNMinElement {
    public static void main(String[] args){
        int [] arr ={34,2,54,8,4,9};
        Scanner sc =new Scanner(System.in);
        System.out.println( "Enter the Kth Element : ");
        int kElement= sc.nextInt();
         Arrays.sort(arr);//[2, 4, 8, 9, 34, 54]
         System.out.println("Sorted Array : "+Arrays.toString(arr));

        int maxElement=arr[arr.length-kElement];
        int minElement=arr[kElement-1];
        System.out.println( kElement+"-th MAXIMUM ELEMENT : "+maxElement);
        System.out.println( kElement+"-th MINIMUM ELEMENT : " +minElement);


    }
}
