package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

//public class ParityCheck extends SortZeroesAndOnes {
public class ParityCheck  {

    public static void main(String[] args) {
//        SortZeroesAndOnes s =new SortZeroesAndOnes();
//        s.insertElements();

        Scanner s =new Scanner(System.in);//1 2 3 4 5 6
        System.out.println("Enter the number of elements that you want to enter: ");
        int n=s.nextInt();

        int[] a= new int[n];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        int left =0;
        int right=a.length-1;
        while (left<right){
            if (a[left]%2!=0 && a[right]%2==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if (a[left]%2==0){
                left++;
            }
            if (a[right]%2!=0){
                right--;
            }
        }
        System.out.println("SORTED ARRAY: "+ Arrays.toString(a));//6 2 4 3 5 1

    }
}


