package ArrayList;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Before remove an Element : "+al);
        al.remove(1);
        System.out.println("After remove an Element : "+al);
        int indexToRemove2 = 2;
        al.remove(indexToRemove2);
        System.out.println("After remove an Element at index " + indexToRemove2 + " : " + al);
    }
}
