package HashMap;

import java.util.HashMap;

public class CountFrequencyOfWords {
    public static void main(String[] args){
        String s = "My name is Pratibha. pratibha is a girl, she is a student";
        s = s.toLowerCase() ;//.replaceAll("[^a-z\\s]", "");
        String [] words = s.split(" ");
        HashMap<String,Integer> wordFreq = new HashMap<>();

        for (String i : words){
            wordFreq.put(i,wordFreq.getOrDefault(i,0)+1);
        }
        //print frequencies
        for (String i :wordFreq.keySet()){
            System.out.println(i+ " : " +wordFreq.get(i));
        }
    }
}
