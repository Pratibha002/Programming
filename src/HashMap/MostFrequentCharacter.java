package HashMap;
import java.util.HashMap;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        String s = "India is a great countryyyy";
        HashMap<Character,Integer> h = new HashMap<Character, Integer>();
        int count=0;
        Character a=null;
        for(int i=0; i<s.length(); i++){
            char c =s.charAt(i);
            if(c!=' '){
                if(h.containsKey(c)){
                    h.put(c,h.get(c)+1);
                }else{
                    h.put(c,1);
                }
            }
        }
        for(Character c : h.keySet()){
            System.out.println(c+" : "+h.get(c));
        }
        for(Character c : h.keySet()){
            if(count<h.get(c)){
                count=h.get(c);
                a=c;
            }
        } System.out.println("Most frequent value : "+count);
        System.out.println("Most frequent character : "+a);
    }
}

