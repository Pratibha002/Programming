package Sorting;

import Array.PrefixSum.PrefixSum;

public class QuickSort {
    public static void main(String[] args) {
        int [] a = {6, 3, 9, 5 ,2 , 8};
        int n = a.length;

        quickSort(a, 0, n-1);
        System.out.println("Sorted array: ");
        PrefixSum.printArray(a);
    }
//time complexity: worst case = O(n^2), Average = O(nlogn)
    /*
    when does worst case condition occurs?
    ==>When pivot is always the smallest or the largest element. e.g. array is already sorted in
    ascending or descending order.

    low = starting index
    high = ending index, n-1.
    i = makes the space for the elements which are smaller than pivot
     */
    public static void quickSort(int[] a, int low, int high) {

        if (low < high){
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex-1);
            quickSort(a, pivotIndex+1, high);
        }

    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];//select the last element of array as pivot
        int i = low-1;

        for (int j=low; j<high; j++){
            if (a[j] < pivot){
                i++;
                //swap, the element who is already present in the array with the new element who found smaller than i
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        //swap with pivot
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;//pivot index
    }
}
/*
sometimes quick sort prefer over merge sort because here we do not have to make the extra array, and worst case
occurs in very rare case.

when we have extra memory, we can take extra array at that time we can use the merge sort, and in worst
case we required time complexity O(nlogn)
 */
