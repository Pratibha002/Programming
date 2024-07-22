package HashSet;

import java.util.HashSet;

public class AddAndRemoveElementsInHashSet {
    public static void main(String[] args) {
        HashSet<Object> h =new HashSet<>();
        h.add("A");
        h.add("hello");
        h.add(1);
        h.add(1.1);
        h.add('b');
        System.out.println(h.add("A"));//duplicate are not allowed we fet false in return
        System.out.println(h);//insertion order is not preserved
        h.remove("A");
        System.out.println("After removal of object : "+h);
        h.clear();
        System.out.println(h);
    }
}
