package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortSquaresByPointer2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int size=s.nextInt();
        int [] a =new int[size];
        System.out.println("ENTER THE ELEMENTS OF AN ARRAY:");
        for (int i=0; i<size; i++){
            a[i]=s.nextInt();
        }
        System.out.println("ARRAY ELEMENTS:"+ Arrays.toString(a));
        int [] ans=sortSquares(a);
        System.out.println("SORTED ARRAY "+Arrays.toString(ans));
    }
    public static int[] sortSquares(int [] arr){
        int left=0;
        int right= arr.length-1;
        int [] ans =new int[arr.length];
        int k= arr.length-1;

        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k--;
                left++;
            }else {
                ans[k]=arr[right]*arr[right];
                k--;
                right--;
            }
        }
        return ans;
    }
}
