package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();

        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> a1=new ArrayList<>();
        ArrayList<Character> a2=new ArrayList<>();

        a.add('A'); a.add('B'); a.add('c'); a.add('d'); a.add('a'); a.add('B');
        a1.add('a'); a1.add('b'); a1.add('C'); a1.add('d'); a1.add('C'); a1.add('b');
        a2.add('a'); a2.add('B'); a2.add('C'); a2.add('d');

        System.out.println("ArrayList a: "+a);
        System.out.println("ArrayList a1: "+a1);
        System.out.println("ArrayList a2: "+a2);

        list.add(a);
        list.add(a1);
        list.add(a2);
        System.out.println("List of ArrayLists: " +list);

        HashSet<Character> union =new HashSet<>(list.get(0));
        for(ArrayList<Character> i : list){
            union.addAll(i);
        }
        System.out.println("Union of ArrayLists: "+union);
    }
}
