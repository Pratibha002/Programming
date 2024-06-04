//Check given string is palindrome or not

package String;
import java.util.Scanner;
public class PalindromeString {
    public static void main (String[] args) {
        // String s = "madam";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s =sc.nextLine().toUpperCase();
        String s2 = "";
        int i;

        for( i=s.length()-1; i>=0; i--){
            // System.out.println(s.charAt(i));
            s2=s2+(s.charAt(i));

        }System.out.println("Reverse String "+s2);
        if(s.equals(s2)) {
            System.out.println("Given string "+s+" is a Palindrome");
        }else{
            System.out.println("Given string "+s+" is not a Palindrome");
        }
        sc.close();
    }


}