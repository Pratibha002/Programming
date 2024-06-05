//Java program to Capitalise first charter of a String .
package String;

public class CapitaliseCharacter {
    public static void main(String[] args){
        String s="this is indore indore is good";
        System.out.println("ORIGINAL STRING : ");
        System.out.println(s);
        System.out.println("CAPITALISE STRING : ");
        String [] words = s.split(" ");
        for(int i=0; i< words.length; i++){
           // System.out.println(words[i]);
            String capitalWord = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            //  words[i]=hello.substring(0,1)->'h'.toUpperCase()->'H'+.substring(1)->ello, Hello
            //Hello
            System.out.print(capitalWord+ " ");
        }
    }
}
