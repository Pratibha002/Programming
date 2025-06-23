package Recursion;

import java.util.Scanner;

//print the sum of first n natural number
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n = sc.nextInt();
        int sum =0;
        int i = 1;
        numSum(i,n,sum);
    }
    public static void numSum(int i, int n , int sum){
        if (i==n){
            sum+= i;
            System.out.println("Sum of the natural numbers: "+sum);
            return;
        }
        sum+=i;
        numSum(i+1, n, sum);
    }
}
