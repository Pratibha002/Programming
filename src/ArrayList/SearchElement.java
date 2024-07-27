package ArrayList;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
      if(al.contains(2)){
          System.out.println("Element found");
      }else{
          System.out.println("Element not found");
      }

    }
}
