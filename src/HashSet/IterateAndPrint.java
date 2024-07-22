package HashSet;

import java.util.HashSet;

public class IterateAndPrint {
    public static void main(String[] args) {
        HashSet<Character> h=new HashSet<>();
        h.add('a');
        h.add('b');
        h.add('c');
        h.add('d');
        h.add('e');
        for(Character c:h){
            System.out.println(c);
        }
    }
}
