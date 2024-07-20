package ArrayList;

import java.util.ArrayList;

public class CheckArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList <Integer> al =new ArrayList<>();
        ArrayList <Integer> al2 =new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Check ArrayList 1 is empty : "+al.isEmpty());
        System.out.println("Check ArrayList 2 is empty : "+al2.isEmpty());

    }
}
