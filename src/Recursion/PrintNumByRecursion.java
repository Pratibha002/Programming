package Recursion;

import java.util.Scanner;

public class ReverseNumByRecursion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");//5
        int n =sc.nextInt();
        printNum(n);

    }
    public static void printNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
}
