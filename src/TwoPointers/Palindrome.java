package TwoPointers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        if(checkPalindrome(s)){
            System.out.println( s+ " is a Palindorme!");
        }else {
            System.out.println( s+ " is not a Palindorme!");
        }
    }

    public  static  boolean  checkPalindrome(String s){
        int left =0;
        int right= s.length()-1;

        while (left<right){
            if (s.charAt(left)!=s.charAt(right) ){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
}
