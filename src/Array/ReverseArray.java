//Multiple ways to sort an array, this is one of them.
package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] originalArray={1,2,3,4,5};
        System.out.println("ORIGINAL ARRAY:");

        for (int i=1; i<=originalArray.length; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("REVERSED ARRAY:");
        for (int i=originalArray.length; i>0; i--){
            System.out.print(i+" ");
        }
    }
}
