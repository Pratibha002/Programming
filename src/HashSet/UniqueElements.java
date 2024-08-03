package HashSet;

import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println("FIRST SET : "+h);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        System.out.println("SECOND SET : "+h1);
        HashSet<Integer> uniqueSet=new HashSet<>(h);//a-b
        HashSet<Integer> uniqueSet2=new HashSet<>(h1);//symmetric difference b-a
        uniqueSet.removeAll(h1);
        uniqueSet2.removeAll(h);

        System.out.println("unique set : "+uniqueSet);
        System.out.println("unique set : "+uniqueSet2);



    }
}
