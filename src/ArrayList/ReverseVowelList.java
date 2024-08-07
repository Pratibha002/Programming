package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseVowelList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word/sentence : ");
        String s = sc.nextLine();
        ArrayList<Character> vowels= new ArrayList<>();

        for (int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        Collections.reverse(vowels);
        System.out.println("Reversed volwels : "+vowels);

        StringBuilder result = new StringBuilder();
        int vowelIndex=0;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(isVowel(c)){
                result.append(vowels.get(vowelIndex++));
            }else{
                result.append(c);
            }

        }
        System.out.println("New String after reverse the vowels : "+result);

    } public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
