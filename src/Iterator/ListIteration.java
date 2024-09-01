package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(2);
        al.add(1);
        al.add(11);
        al.add(18);
        al.add(9);
/*here we write this for loop two times instead of it we make the method names iterateList by which we can remove
the repetition of code
    for(Integer i : al){
            System.out.print(i+" ");
        }

     iterateList(al); when we wont make the separate class at that time we call the method like that
 */
        utilityClass.iterateList(al);

        Collections.sort(al);

        System.out.println();

        System.out.println("After sorting: ");

        utilityClass.iterateList(al);


    }
/*   private static void iterateList(ArrayList<Integer> al) {
//        for(Integer i : al){       move this method in new class because whenever we need in any program we can use it.
//            System.out.print(i+" ");
//       }
}*/

}
