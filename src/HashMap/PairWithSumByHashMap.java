package HashMap;

import java.util.HashMap;

public class PairWithSumByHashMap {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};
        int key =7;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0; i<a.length; i++){
            int n=key-a[i];

            if(h.containsKey(n)){
                System.out.println(n+" "+a[i]);
            }h.put(a[i],i);
        }
    }
}
