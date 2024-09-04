package Array;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] a={1,2,3,5,2,6,8};

        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for (int i : a){
            if(seen.contains(i)){
                duplicate.add(i);
            }else {
                seen.add(i);
            }
        }

        System.out.println("Duplicate value: "+duplicate);
    }
}
