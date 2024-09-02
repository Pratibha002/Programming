package Array;

import java.util.Arrays;

public class kthSmallestElement {
    public static void main(String[] args) {
        int [] a ={4,5,3,1,7,19,10,8,15};
        int k=4;
        Arrays.sort(a);
        System.out.println("Sorted Array:" +Arrays.toString(a));
        int minElement=a[k-1];

        System.out.println("Kth min Element "+minElement);
    }
}
