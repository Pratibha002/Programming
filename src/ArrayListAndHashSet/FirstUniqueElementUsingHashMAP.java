package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstUniqueElementUsingHashMAP {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(76); a.add(23); a.add(21); a.add(54); a.add(1); a.add(11);
        a.add(2); a.add(2); a.add(22);
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Integer firstUnique = null;
        for (Integer num : a) {
            if (countMap.get(num) == 1) {
                firstUnique = num;
                break;
            }
        }
        System.out.println("First unique element: " + firstUnique);
    }
}
