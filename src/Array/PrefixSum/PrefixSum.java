package Array;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int [] a = takeInput();
        printArray(a);
        System.out.println();
        prefixSumArray(a);
        System.out.println("PREFIX SUM ARRAY");
        printArray(a);


    }
    static int[] takeInput(){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE: ");
        int n = sc.nextInt();
        int [] arr =new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    static void printArray(int [] a){
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    static void prefixSumArray(int []a){
        for (int i=1; i<a.length; i++){
            a[i]=a[i-1]+a[i];
        }
    }
}
