package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        SortZeroesAndOnes s =new SortZeroesAndOnes();
        int []a=s.insertElements();
        System.out.println("Original Array: "+Arrays.toString(a));

        int left =0;
        int right= a.length-1;

        while (left<right){
            int temp=0;
            if (a[left]==1 && a[right]==0){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
            }if (a[left]==0 ){
                left++;
            }if ( a[right]==1){
                right--;
            }
        }
        System.out.println("SORTED ARRAY: "+ Arrays.toString(a));
    }
    public int[] insertElements(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int [] a= new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
          return a;
    }

}
