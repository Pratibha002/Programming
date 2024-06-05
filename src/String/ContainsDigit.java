//How to Check if the String Contains Only Digits
package String;
import java.util.Scanner;
public class ContainsDigit {
    public static void main(String [] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number : ");
      String num = sc.nextLine();
//      String num = "2133434";
      boolean containsDigit= true;
      for(int i=0; i<num.length(); i++){
          char ch = num.charAt(i);
          if(ch < '0' || ch >'9'){
              containsDigit=false;
              break;
          }
      }
      if(containsDigit){
          System.out.println("Correct String!!  " +num );
      }else{
            System.out.println("Invalid String, because it doesn't contain only digit!!  " +num );
      }sc.close();
    }
}

