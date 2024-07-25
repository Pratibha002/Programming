package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapKeyValue {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>>h=new HashMap<>();
        HashMapKeyValue obj =new HashMapKeyValue();
        List<Integer> l=obj.table(2);
        List<Integer> l1=obj.table(3);
        List<Integer> l2=obj.table(4);

        h.put(2,l1);
        h.put(3,l1);
        h.put(4,l1);

        System.out.println(h);
    }
    public List<Integer> table(Integer value){
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1; i<=10; i++){
            a.add(value*i);
        }
        return a;
    }
}
