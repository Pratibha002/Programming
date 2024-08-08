package ArrayListAndHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4); a.add(5);
        a.add(11); a.add(2); a.add(13); a.add(4); a.add(15);
        System.out.println("ArrayList : "+a);
        HashSet<Integer>h=new HashSet<>(a);
        System.out.println("HashSet : "+h);

        Integer smallest=null;
        Integer largest=null;

        for(Integer i :h){
            if(smallest==null||smallest>i){
                smallest=i;
            }
            if(largest==null||largest<i){
                largest=i;
            }
        }
        System.out.println("Largest element : "+largest);
        System.out.println("Smallest element : "+smallest);

    }
}
