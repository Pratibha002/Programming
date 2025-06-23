package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n =s.nextInt();
        int ans = calFactorial(n);
        System.out.println(ans);
    }

    public static int calFactorial(int n) {

        if (n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calFactorial(n-1);//fact_nm1 = n minus 1 : n-1
        int factorial = n * fact_nm1;
        return factorial;

    }
}
