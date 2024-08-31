package Array;

import java.util.Arrays;

import java.util.Scanner;

public class SortSquaresByPointer {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of array:");//[-10, -3, -2, 1, 4, 5]
        int size =s.nextInt();
        int [] a =new int[size];
        System.out.println("Enter the Elements of array:");
        for(int i=0; i<size; i++){
           a[i]=s.nextInt();
        }
        System.out.println("Array Elements:"+ Arrays.toString(a));
        int [] ans=sortSquare(a);
        System.out.println("Sorted Array: "+Arrays.toString(ans));
        reverse(ans);
        System.out.println("Sorted Array: "+Arrays.toString(ans));
    }
    public static void  reverse(int [] a){
        int left =0;
        int right=a.length-1;

        while (left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }

    }
    public static int[] sortSquare(int [] arr){
        int left =0;
        int right=arr.length-1;
        int [] ans=new int[arr.length];
        int k=0;
        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){//abs stand for absolute value we check the absolute value and ignore the signs
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            }else {
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }
        }
        return ans;
    }
}
