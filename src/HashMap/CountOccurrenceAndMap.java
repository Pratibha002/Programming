package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurrenceAndMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s =sc.nextLine().toLowerCase();
        //String s ="India is a great country".toLowerCase();
        HashMap<Character,Integer> h =new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c!=' '){
                if(h.containsKey(c)){
                    h.put(c,h.get(c)+1);
                }else{
                    h.put(c,1);
                }

            }
        }for(Character i : h.keySet()){
            System.out.println(i+" : "+h.get(i));
        }
    }
}
