package HashMapHashSet;
import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {

        SortedSet<Integer>h= new TreeSet<>();
        h.add(5);h.add(7);h.add(1);h.add(8);h.add(1);h.add(15);h.add(19);h.add(20);h.add(12);
        System.out.println("Sorted Set: "+h);
        System.out.println("lowest Element: "+h.first());
        System.out.println("Highest Element: "+h.last());
        System.out.println();
        Integer lowest=h.first();
        Integer highest=h.last();
        HashSet<Integer>missingNum=new HashSet<>();
        boolean isFound=false;
        for(int i=lowest; i<=highest; i++){
            if(!(h.contains(i))){
               isFound=true;
               missingNum.add(i);
            }
        }if(isFound){
            System.out.println("Missing Numbers: "+missingNum);
        }


    }
}
