package Sorting;
//import Array.PrefixSum.PrefixSum;
/*
Bubble Sort
Idea: if arr[i] > arr[i+1] swap them. To place the element in their respective position,
we have to do the following operation N-1 times.
Time Complexity: O(N2)

 */
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a = {7,8,3,1,2};
        //sorting in asc order
        bubbleSort(a);
        System.out.println("Sorting in ascending order.");
        //PrefixSum.printArray(a);
        System.out.println(Arrays.toString(a));

        //sorting in desc order
        bubbleSortDescendingOrder(a);
        System.out.println("Sorting in descending order.");
        System.out.println(Arrays.toString(a));
    }
    //sorting in ascending order....
    //time complexity = O(n^2)
    public static void bubbleSort(int []a){

        for (int i=0; i<a.length-1; i++){
            for (int j=0; j<a.length-1-i; j++){
                if (a[j] > a[j+1]){
                    //swap
                    int temp= a[j];
                    a[j] =a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
    //sorting in descending order....
    //time complexity = O(n^2)
    public static void bubbleSortDescendingOrder(int [] a){
        for (int i = 0 ; i<a.length-1; i++){
            for (int j=0; j<a.length-1-i; j++){
                if (a[j]< a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
}
