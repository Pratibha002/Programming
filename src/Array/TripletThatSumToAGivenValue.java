/*
     1) Find the approach for whom will have to find -> consecutive or random?
     2) In case of consecutive we will check three consecutive element are making 13 or not
     3) in case of random we will check
     random r
    we use  contains() method
*/
package Array;

import java.util.ArrayList;

public class TripletThatSumToAGivenValue {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();//it is a consecutive approach
        //{1, 4, 45, 6, 10, 8}
        arr.add(1);
        arr.add(4);
        arr.add(45);
        arr.add(6);
        arr.add(10);
        arr.add(8);
        System.out.println("Given array :"+arr);
        int X = 13;
        boolean contains=false;

        for(int i=0; i< arr.size()-1; i++){
            int required =X- (arr.get(i) + arr.get(i+1));
            if(arr.contains(required)){
                contains=true;
            }
//            System.out.println(required);
        }if(contains){
            System.out.println("Triplet found !!");
        }else {
            System.out.println("Triplet not found !!");
        }
    }
}
