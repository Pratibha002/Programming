package ArrayList;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add(1);
        al.add(1.1);
        al.add("C");
        al.add("hello");
        al.set(0,"change");
        System.out.println("Modified ArrayList " +al);
        al.set(2,5);
        System.out.println("Modified ArrayList " +al);

    }
}
