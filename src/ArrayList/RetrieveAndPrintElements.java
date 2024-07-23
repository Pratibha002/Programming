package ArrayList;

import java.util.ArrayList;

public class RetrieveAndPrintElements {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<Object> al3 = new ArrayList<>();
        System.out.println("Integral values");
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println("String values");
        al2.add("Apple");
        al2.add("Ball");
        al2.add("Cat");
        al2.add("Dog");
       for(String i:al2){
           System.out.print(i+" ");
       }

        System.out.println("Object values");
        al3.add(1);
        al3.add(1.1);
        al3.add("C");
        al3.add("Can give any vlaue");
        for(Object o:al3){
            System.out.print(o+" ");
        }
        System.out.println(al3.get(0));
        System.out.println(al2.get(1));
        System.out.println(al.get(3));


    }
}
