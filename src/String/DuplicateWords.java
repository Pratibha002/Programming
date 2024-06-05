//Java Program to Find Duplicate Words in a String
package String;
import java.util.Scanner;
public class DuplicateWords {
    public static void main(String[] args) {
        //String s = "hello java hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s =sc.nextLine();
        String[] words = s.split(" ");
        boolean duplicate = false;

        //System.out.println("Duplicate words in the string:");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    // Print the duplicate word only once
                    if (!duplicate) {
                        System.out.println("Duplicate words in the string : "+words[i]);
                        duplicate = true;
                    }
                    break;
                }
            }
            duplicate = false; // Reset
        }
    }
}
