//merge two arraylist without duplicates using hashset
package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Character> a =new ArrayList<>();
        ArrayList<Character> a1 =new ArrayList<>();

        a.add('A');
        a.add('B');
        a.add('c');
        a.add('d');
        a.add('a');
        a.add('B');
        System.out.println("First Arraylist : " +a);
        a1.add('a');
        a1.add('b');
        a1.add('C');
        a1.add('d');
        a1.add('C');
        a1.add('b');
        System.out.println("Second Arraylist : " +a1);

        HashSet<Character> h= new HashSet<>(a);
        h.retainAll(a1);
        System.out.println("Hashset : " +h);


    }
}
