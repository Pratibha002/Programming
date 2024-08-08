package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        List<ArrayList<Character>>list  =new ArrayList<>();

        ArrayList<Character> a=new ArrayList<>();
        ArrayList<Character> a1=new ArrayList<>();
        ArrayList<Character> a2=new ArrayList<>();

        a.add('A'); a.add('B'); a.add('c'); a.add('d'); a.add('a'); a.add('B');
        a1.add('a'); a1.add('b'); a1.add('C'); a1.add('d'); a1.add('C'); a1.add('b');
        a2.add('a'); a2.add('B'); a2.add('C'); a2.add('d');
        System.out.println("First ArrayList : "+a);
        System.out.println("First ArrayList : "+a1);
        System.out.println("First ArrayList : "+a2);

        list.add(a);
        list.add(a1);
        list.add(a2);
        System.out.println("list : "+list);

        HashSet<Character> intersection = new HashSet<>(list.get(0));
        for(ArrayList<Character> i : list){
            intersection.retainAll(i);
        }
        System.out.println("Intersection of all lists: " + intersection);
    }
}
