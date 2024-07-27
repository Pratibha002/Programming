package ArrayList;

import java.util.ArrayList;

public class copyArrayList {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();
        al.add(1);
        al.add(1.1);
        al.add('a');
        al.add("hello");
        System.out.println("Original ArrayList: " + al);
        ArrayList<Object> copy = new ArrayList<>(al);

        System.out.println("Copy of ArrayList: " + copy);
    }
}
/*
 ArrayList<Object> copy = new ArrayList<>(al);
Shallow Copy: This approach creates a shallow copy of the ArrayList, meaning the elements themselves are not cloned.
 Both al and copy will contain references to the same objects.
 */