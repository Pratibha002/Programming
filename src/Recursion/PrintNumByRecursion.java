package Recursion;

import java.util.Scanner;

public class PrintNumByRecursion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");//5
        int n =sc.nextInt();
        System.out.println("NUMBER IN DESCENDING ORDER");
        printNumInReverse(n);
        System.out.println("NUMBER IN ASCENDING ORDER");
        printNum(n);

    }
    public static void printNumInReverse(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNumInReverse(n-1);
    }


//    public static void printNum(int n){  // if n = 1, up to 5 print the numbers
//        if (n==6){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//    }

    public static void printNum(int n) {
        if (n == 0) {  // Base case to stop recursion when n reaches 0
            return;
        }
        printNum(n - 1);  // Recursive call before printing
        System.out.println(n);  // Print number in ascending order after recursion
    }
}
