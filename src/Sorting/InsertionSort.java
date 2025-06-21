package Sorting;

import java.util.Arrays;
/*
Insertion Sort
Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part,
      and shift the elements accordingly.
Time Complexity: O(N2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {7, 8 , 3, 1, 2 };
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] a) {
        for (int i=1; i<a.length; i++){//indexing start from 1 because we considered the 1st element in sorted array
            int currentElement = a[i];
            int j= i-1;//j is used for sorted part.
            while (j>=0 && currentElement < a[j]){
                a[j+1] = a[j];
                j--;
            }
            //place the element in sorted array
            a[j+1] = currentElement;

        }
    }
}
