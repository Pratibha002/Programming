//Java Program to Count Number of Words in Given String
package String;
import java.util.Scanner;
public class CountNumberOfWords {

    public static void main(String[] args){
        // String s = "hello world hi java";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s =sc.nextLine();
        String [] words = s.split(" ");
        int count = words.length;
        System.out.println("Number of words in string = " + count);
    }
}
