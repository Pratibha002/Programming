package Sorting;
/*
Selection Sort
Idea: The inner loop selects the minimum element in the unsorted array and places the
      elements in increasing order.
Time complexity: O(N2)
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a = {7,8,3,1,2};
        //sorting in asc order
        selectionSort(a);
        System.out.println("Sorting in ascending order.");
        System.out.println(Arrays.toString(a));

        //sorting in desc order..
        selectionSortDescending(a);
        System.out.println("Sorting in descending order.");
        System.out.println(Arrays.toString(a));

    }
    //time complexity = O(n^2)
    public static void selectionSort(int [] a){

        for (int i=0; i<a.length-1; i++){
            int greatestElement =i;
            for (int j=i+1; j<a.length; j++){
                if (a[greatestElement]>a[j]){
                    greatestElement = j;
                }
            }
            int temp =a[greatestElement];
            a[greatestElement] = a[i];
            a[i] = temp;
        }
    }

    //time complexity = O(n^2)
    public static void selectionSortDescending(int [] a){

        for (int i=0; i<a.length-1; i++){
            int smallestElement =i;
            for (int j=i+1; j<a.length; j++){
                if (a[smallestElement] < a[j]){
                    smallestElement = j;
                }
            }
            int temp = a[smallestElement];
            a[smallestElement] = a[i];
            a[i] = temp;
        }
    }
}
