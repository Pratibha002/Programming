package ArrayListAndHashSet;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class UniqueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<Integer> a1 =new ArrayList<>();
        ArrayList<Integer> a2 =new ArrayList<>();

        a1.add(2); a.add(2); a2.add(2);
        a.add(1);  a.add(2);  a.add(3 );  a.add(4);  a.add(5);
        a1.add(5);  a1.add(6);  a1.add(7 );  a1.add(4);  a1.add(3);
        a2.add(7);  a2.add(8);  a2.add(9 );  a2.add(10);

        System.out.println("First ArrayList: "+a);
        System.out.println("Second ArrayList: "+a1);
        System.out.println("Third ArrayList: "+a2);

        HashSet<Integer> h =new HashSet<>(a);
        h.addAll(a1);
        h.addAll(a2);
        System.out.println("HashSet: "+h);

        ArrayList<Integer>uniqueList=new ArrayList<>(h);
        System.out.println("Unique Array List: "+uniqueList);

    }
}
//int [] array1={1,2,3,4,5};
//HashSet<Integer> uniqueSet =new HashSet<>(a);
//addArrayToSet(array1, uniqueSet);
//The addArrayToSet method is used to add elements from each array to the HashSet.
// This method iterates through the array and adds each element to the HashSet.