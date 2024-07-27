package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class createAndAddElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Float> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<Object> al3 = new ArrayList<>();
        System.out.println("Integral values");
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        System.out.println("Float values");
        al1.add(1.1f);
        al1.add(2.2f);
        al1.add(3.3f);
        al1.add(4.0f);
        System.out.println(al1);
        System.out.println("String values");
        al2.add("Apple");
        al2.add("Ball");
        al2.add("Cat");
        al2.add("Dog");
        System.out.println(al2);
        System.out.println("Object values");
        al3.add(1);
        al3.add(1.1);
        al3.add("C");
        al3.add("Can give any vlaue");
        System.out.println(al3);


    }
}
