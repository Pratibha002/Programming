package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("First HahSet: "+set1);
        System.out.println("First HahSet: "+set2);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection"+intersection);

        HashSet<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        symmetricDifference.removeAll(intersection);
        System.out.println("symmetricDifference: "+symmetricDifference);

    }
}
