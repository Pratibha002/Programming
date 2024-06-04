//Java Program to Find Duplicate Characters in a String
package String;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args){
        //String s ="madam";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine().toUpperCase();
        boolean duplicate=false;
        int i;
        for( i=0; i<s.length(); i++){
            for(int j=0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    duplicate=true;
                    System.out.println("Duplicate character : "+s.charAt(i));
                }
            }
            // System.out.println(s.charAt(i));
        }//        }if(duplicate)
//            System.out.println("Duplicate character : " + s.charAt(i));
//        else{
//            System.out.println("NO Duplicate character : "+s);
//        }
        sc.close();
    }

}