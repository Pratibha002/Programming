package Array;

import java.util.Scanner;

/*
GIVEN AN ARRAY OF INTEGER SIZE N. ANSWER Q QUERIES WHERE YOU NEED TO PRINT THE SUM OF VALUES IN A GIVEN
RANGE OF INDICES FROM L to R (BOTH INCLUDED).
NOTE: THE VALUE OF L and R IN QUERIES FOLLOW 1-BASED INDEXING.
 */
public class SumInRange {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int [] a = {0,1 ,3 ,5 ,7, 9 ,8};//HERE WE INSERT THE DUMMY 0 FOR 1-BASED INDEXING, IF WE TAKE THE
        //INPUT FROM USER WE WRITE LIKE THAT  int [] a = new int [n+1];
        PrefixSum.printArray(a);
        System.out.println();
        System.out.println("PREFIX SUM");
        PrefixSum.prefixSumArray(a);
        PrefixSum.printArray(a);
        System.out.println("ENTER THE NUMBER OF QUERIES: ");

        int q= sc.nextInt();
        while (q-- > 0){
            System.out.println("ENTER THE RANGE: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans =a[r] - a[l-1];
            System.out.println("sum" + ans);
        }

    }
}
