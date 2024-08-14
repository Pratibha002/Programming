package HashMapHashSet;

import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 5};
        int[] array2 = {4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 1};

        List<int[]> a = Arrays.asList(array1, array2, array3);

        HashSet<Integer> h = new HashSet<>();

        // Using HashMap to store element counts
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Process each array
        for (int[] i : a) {
            for (int num : i) {
                // Add to set (automatically handles duplicates)
                h.add(num);

                // Update element count in HashMap
                elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
            }
        }

        // Display unique elements
        System.out.println("Unique elements using Set:");
        for (Integer num : h) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display elements with their counts using HashMap
        System.out.println("Element counts using HashMap:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
