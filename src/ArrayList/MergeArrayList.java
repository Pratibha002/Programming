package ArrayList;

import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(4);
        al.add(1);
        al.add(1.1);
        al.add("C");
        al.add("hello");
        al.addAll(al2);
        System.out.println("Merged ArrayList: " +al);
    }
}
