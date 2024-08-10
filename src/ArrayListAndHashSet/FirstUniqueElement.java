package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(76); a.add(23); a.add(21); a.add(54); a.add(1); a.add(11);
        a.add(2); a.add(2); a.add(22);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (Integer num : a) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        seen.removeAll(duplicates);

        Integer firstUnique = null;
        for (Integer num : a) {
            if (seen.contains(num)) {
                firstUnique = num;
                break;
            }
        }
        System.out.println("First unique element: " + firstUnique);
    }
}
