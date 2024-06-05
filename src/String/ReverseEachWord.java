//Java Program to Reverse Each Word of a String
package String;
import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args){
//        String s ="Hello world hello java";
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String s=sc.nextLine();
        System.out.println("Original String : "+s);
        System.out.println("Reverse String : ");
        String [] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            String s2=words[i];
//            System.out.print(s2+ " ");
            String reverse=" ";
            for(int j=s2.length()-1; j>=0;j--){
                reverse=reverse+s2.charAt(j);
               // System.out.println(s2);
            }System.out.print(reverse+ " ");
        }sc.close();
    }
}
