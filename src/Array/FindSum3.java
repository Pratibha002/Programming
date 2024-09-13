package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindSum3 {
    public static void main(String[] args) {
       int [] a =  {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the element: ");
        int k=s.nextInt();

        ArrayList<Integer> al=new ArrayList<>();

        for (int i: a){
            al.add(i);
        }
        Collections.sort(al);
        System.out.println("Original List: "+al);

        List<List<Integer>>pair =new ArrayList<>();
        int left=0;
        int right=al.size()-1;

        while (left<right){
            List<Integer> ll=new ArrayList<>();
            if (al.get(left)+ al.get(right)==k){
                ll.add(al.get(left));
                ll.add(al.get(right));
                pair.add(ll);
                left++;
                right--;

            }else if (al.get(left)+al.get(right)<k){
                left++;
            }else {
                right--;
            }

        }
        System.out.println("Pairs whose sum is equal to "+k+": "+ pair);

    }
}
