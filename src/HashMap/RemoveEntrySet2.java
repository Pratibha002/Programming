package HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveEntrySet2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Key :" );
        int key=s.nextInt();
        System.out.println("Enter the value :" );
        int value=s.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(1,11);
        h.put(2,22);
        h.put(3,22);
        h.put(8,22);
        h.put(4,44);
        h.put(5,55);

        if(h.containsValue(value)&& h.containsKey(key)){
            h.remove(key,value);
        }
        System.out.println(h);

    }
}
