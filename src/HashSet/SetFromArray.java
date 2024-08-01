package HashSet;

import java.util.HashSet;

public class SetFromArray {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,55,6,3,6,7,8,8,9,0};
        HashSet<Integer> h = new HashSet<>();
        for(int i : a){
            h.add(i);

        } System.out.println(h);
    }
}
