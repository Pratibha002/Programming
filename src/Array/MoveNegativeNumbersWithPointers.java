package Array;

import java.util.Arrays;

public class MoveNegativeNumbersWithPointers {
    public static void main(String[] args) {
        int [] a ={-12, 11, -13, -5, 6, -7, 5, -3, -6};

        System.out.println("Original Array: "+Arrays.toString(a));

        int left=0;
        int right=a.length-1;

        while (left<=right){
            if (a[left]<0 && a[right]<0){
                left++;
            }
            else if (a[left]>0 &&a[right]<0){
            int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }else if (a[left]>0&&a[right]>0){
                right--;
            }else {
                left++;
                right--;
            }
        }
        System.out.println("Sorted Array"+Arrays.toString(a));
    }
}
