package Array;

import java.util.Arrays;

public class kthLargestElement {
    public static void main(String[] args) {
        int [] a ={4,5,3,1,7,19,10,8,15};
        int k=4;
        Arrays.sort(a);
        System.out.println("Sorted Array:" +Arrays.toString(a));
        int maxElement=a[a.length-k];

        System.out.println("Kth max Element "+maxElement);
    }
}
