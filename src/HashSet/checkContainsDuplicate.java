package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class checkContainsDuplicate {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "apple"));
        System.out.println("Set: "+set);

        HashSet<String> containsDuplicate = new HashSet<>();
        boolean hasDuplicate=false;
        for (String i: set){
           if(!containsDuplicate.add(i)){
               hasDuplicate=true;
               break;
           }
        }
        if (hasDuplicate){
            System.out.println("Duplicate found");
        }else{
            System.out.println("Duplicate not found");
        }
    }
}
