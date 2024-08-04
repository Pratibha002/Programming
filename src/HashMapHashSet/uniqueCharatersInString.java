package HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueCharatersInString {
    public static void main(String[] args) {
        String s ="Hello World";
        HashMap<Character,Integer> h = new HashMap<>();
       HashSet<Character> hs=new HashSet<>();

        for(int i=0; i<s.length(); i++){

            char c =s.charAt(i);
            if(c!=' '){
                hs.add(c);
                if(h.containsKey(c)){
                    h.put(c, h.get(c)+1);
                }else{
                    h.put(c,1);
                }
            }



        } System.out.println("Total number of Unique Characters : "+hs.size());
        for(Character c :h.keySet()){
            System.out.println(c+" : "+h.get(c));

        }
    }


}
