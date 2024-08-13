//Java Program to Count the Occurrences of Each Character
package String;
import java.util.Scanner;
public class CountOccurrenceOfCharacter {
    public static void main(String[] args) {
        //String s = "hello world";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s =sc.nextLine();
        //int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Skip counting if the character has already been counted
            if (s.indexOf(ch) != i) {
                continue;
            }
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " -> " + count);
        }sc.close();
    }
}
/* h ->1
   e ->2
   l ->3
   l ->ignore
   o ->2
   w->1
   o->ignore
   r->1
   l->ignore
   d->1

   o/p
   h ->1
   e ->2
   l ->3
   o ->2
   w->1
   r->1
   d->1
*/
