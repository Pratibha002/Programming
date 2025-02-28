package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int  n = sc.nextInt();

        System.out.println("Enter the Strings: ");
        String [] s = new String[n];
        sc.nextLine();

        for (int i=0; i<n; i++){
            s[i]=sc.nextLine();
        }
        System.out.println("Given words :"+Arrays.toString(s));

        for (String str : s){
            if(isPalindrome(str)){
                System.out.println(str +" is a Palindrome.");
            }
            else {
                System.out.println(str+" is not a Palindrome.");
            }
        }

    }

    public static boolean isPalindrome(String s){
        int left =0;
        int right=s.length()-1;

        while (left<right){
           if (s.charAt(left)!= s.charAt(right)){
               return false;
           }left++;
           right--;
        }
        return true;
    }
}
