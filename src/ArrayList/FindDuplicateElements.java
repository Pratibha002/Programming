package ArrayList;

import java.util.ArrayList;

public class FindDuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(4); a.add(5); a.add(2);
        a.add(2); a.add(5); a.add(6); a.add(4);

        System.out.println("Arraylist: "+a);

        ArrayList<Integer> duplicates = new ArrayList<>();
        boolean isDuplicate;
        int count=0;

        for (int i = 0; i < a.size(); i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && !duplicates.contains(a.get(i))) {
                duplicates.add(a.get(i));
            }
        }

        if (duplicates.size() > 0) {
            System.out.println("Duplicate elements: " + duplicates);
        } else {
            System.out.println("No duplicate elements found.");
        }
        System.out.println("Number of duplicate elements: "+count);
    }
}
