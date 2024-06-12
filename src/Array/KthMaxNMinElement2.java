//Find the maximum and minimum element in an array

package Array;

import java.util.Scanner;

public class KthMaxNMinElement2 {
    public static void main(String[] args){
        int [] arr ={34,2,54,8,4,9};
        Scanner sc =new Scanner(System.in);
        int temp=0;
        System.out.println("Enter the value of Kth Element : ");
        int kElement=sc.nextInt();

        if(kElement>arr.length||kElement<0){
            System.out.println("ARRAY OUT OF INDEX !! ");
        }else{
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }System.out.println("SORTED ARRAY !! ");
       for(int i: arr){
            System.out.print(i+" ");//[2, 4, 8, 9, 34, 54]
        }
        int maxElement=arr[arr.length-kElement];
        int minElement=arr[kElement-1];
        System.out.println();
        System.out.println( kElement+"-th MAXIMUM ELEMENT : "+maxElement);
        System.out.println( kElement+"-th MINIMUM ELEMENT : " +minElement);

    }
}
