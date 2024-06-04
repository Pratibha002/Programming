//Java Program to Count Vowels and Consonants in a String
package String;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String [] args){
        //String s ="hello world";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : " );
        String s = sc.nextLine().toLowerCase();
        int vowelCount=0;
        int consonantCount=0;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u' )){
                vowelCount++;

            }else {
                consonantCount++;
            }
        }System.out.println("Vowels : " +vowelCount);
        System.out.println("consonant : " +consonantCount);
    }
}

