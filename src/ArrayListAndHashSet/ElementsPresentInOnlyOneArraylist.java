package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ElementsPresentInOnlyOneArraylist {
    public static void main(String[] args) {
        ArrayList<Character> a =new ArrayList<>();
        ArrayList<Character> a1 =new ArrayList<>();

        a.add('A'); a.add('B'); a.add('c'); a.add('d'); a.add('a'); a.add('B');  a.add('E');
        System.out.println("First Arraylist : " +a);
        a1.add('a'); a1.add('b'); a1.add('C'); a1.add('d'); a1.add('C'); a1.add('b');
        System.out.println("Second Arraylist : " +a1);
        HashSet<Character> h =new HashSet<>(a);
        h.removeAll(a1);
        System.out.println("Elements those are present only in first ArrayList : "+h);

        HashSet<Character> h1 =new HashSet<>(a1);
        h1.removeAll(a);
        System.out.println("Elements those are present only in Second ArrayList : "+h1);

    }
}
