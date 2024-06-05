//How to Check if the String Contains Only Letters
package String;

import java.util.Scanner;

public class ContainsLetters {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String letter = sc.nextLine();
        boolean containsLetter= true;
        for(int i=0; i<letter.length(); i++){
            char ch = letter.charAt(i);
            if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
                containsLetter=false;
                break;
            }
        }
        if(containsLetter){
            System.out.println("Correct String!!  " +letter );
        }else{
            System.out.println("Invalid String, because it  contain  digit!!  " +letter);
        }sc.close();
    }
}
