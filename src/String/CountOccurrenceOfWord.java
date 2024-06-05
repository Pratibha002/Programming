//Java Program to Count Occurrences of Words in a String
package String;
import java.util.Scanner;
public class CountOccurrenceOfWord {
    public static void main(String[] args) {
        //String s = "hello java hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        //System.out.println("Duplicate words in the string:");
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            if (words[i].equals(" ")) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                    words[j] = " ";
                }
            }if (count > 0) {
                System.out.println("Duplicate word :  " + words[i] + " -> " + (count + 1));
            }
        }sc.close();
    }
}
