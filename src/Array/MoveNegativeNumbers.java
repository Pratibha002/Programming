package Array;

import java.util.Arrays;

public class MoveNegativeNumbers {
    public static void main(String[] args) {
        int [] a ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Original Array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted array: "+Arrays.toString(a));
    }
}
