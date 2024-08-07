package ArrayListAndHashSet;
import java.util.ArrayList;
import java.util.HashSet;
public class CheckElements {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        HashSet<Integer> h =new HashSet<Integer>(a);

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("first arraylist : " +a);

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("first arraylist : " + a1);

        h.addAll(a1);
        boolean allPresent = h.containsAll(a1);
        System.out.println("All elements of the second ArrayList are in the HashSet: " + allPresent);
        System.out.println(h);


    }

}
