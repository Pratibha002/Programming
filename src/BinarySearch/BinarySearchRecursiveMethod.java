package BinarySearch;


public class BinarySearchRecursiveMethod {
    public static void main(String[] args) {
        int [] a ={1,2,4,5, 12,23,67,89,90};
        int item= 4;
        BinarySearchRecursiveMethod obj =new BinarySearchRecursiveMethod();
        int result = obj.Recursion(a,item,0,a.length-1);
        if (result==-1){
            System.out.println("item not found!!");
        }else {
            System.out.println("item found at position: "+result);
        }

    }
    public  int Recursion(int[] a, int item, int low, int high){
        if (high>=low){
            int mid =low+(high-low)/2;
            /*
           Using int mid = low + (high - low) / 2; is a safer approach for calculating the midpoint in
           binary search because it prevents overflow, ensuring the program behaves correctly even with
           large values. It's a good practice to follow in scenarios where the values can be large.
             */

            if (item==a[mid]){
                return mid;
            }
            else if (item>a[mid]) {
                return Recursion(a, item, mid+1, high);
            }else{
                return Recursion(a, item, low,mid-1);
            }
        }

        return -1;
    }
}
