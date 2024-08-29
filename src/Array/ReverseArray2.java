package Array;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int [] originalArray={1,2,3,4,5};

        int [] reverseArray = new int[originalArray.length];

        for(int i=0; i<originalArray.length;i++){
            reverseArray[i]=originalArray[originalArray.length-i-1];
        }
        System.out.println("REVERSED ARRAY: "+ Arrays.toString(reverseArray));
    }
}
