package HashMapHashSet;

import java.util.HashMap;

public class MapWordsToTheirLengths {
    public static void main(String[] args) {
        String s ="India is a great country";
        String [] s1=s.split(" ");
        HashMap<String, Integer>H =new HashMap<>();
        for(String word : s1){
            H.put(word, word.length());
        }
        System.out.println("WORDS AND THEIR LENGTH: "+H);
    }
}
