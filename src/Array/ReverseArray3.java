package Array;

import java.util.Arrays;

public class ReverseArray3 {
    public static void main(String[] args) {
        int [] originalArray={1,2,3,4,5};
        int left=0;
        int right=originalArray.length-1;

        while( left<right){
            int temp=originalArray[left];//Store the value at the left pointer in temporary variable
            originalArray[left]=originalArray[right];//assign the value of  right pointer into left
            originalArray[right]=temp;//assign the stored value of left pointer into right
            left++;
            right--;

        }
        System.out.println(Arrays.toString(originalArray));
    }
}
