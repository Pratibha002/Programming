package ArrayListAndHashSet;
import java.util.ArrayList;
import java.util.HashSet;

public class commonElements {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        ArrayList<Integer> a1 =new ArrayList<>();
        HashSet<Integer>H = new HashSet<>();
        HashSet<Integer>commonElement = new HashSet<>();
        a.add(1);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(2);
        a1.add(11);
        a1.add(1);
        a1.add(33);
        a1.add(4);
        a1.add(44);
        a1.add(5);
        a1.add(2);
        for(int i : a){
            H.add(i);
        }
        for(int i : a1){
            if(H.contains(i)){
                commonElement.add(i);
            }
        }
        System.out.println(commonElement);
    }
}
