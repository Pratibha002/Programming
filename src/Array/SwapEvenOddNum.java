package Array;

import java.util.Arrays;

//parity program based on two pointers
public class SwapEvenOddNum {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,21,12,15,13};
        for(int i=0 ; i<=a.length; i++){
            int left =0;
            int right=a.length-1;

            while(left<right){
                int temp=a[left];
                if(a[left]%2==1 && a[right]%2==0){
                    a[left]=a[right];
                    a[right]=temp;
                    left++;
                    right--;
                }
                if(a[left]%2==0){
                    left++;
                }
                if(a[right]%2==1){
                    right--;
                }
            }
        }
        System.out.println("new array: "+ Arrays.toString(a));
    }
}
