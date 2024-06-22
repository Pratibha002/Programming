package ArrayList;
import java.util.ArrayList;
public class TripletThatSumToAGivenValue2 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();//it is a random approach
        //{1, 4, 45, 6, 10, 8}
        arr.add(1);
        arr.add(4);
        arr.add(45);
        arr.add(6);
        arr.add(10);
        arr.add(8);
        System.out.println("Given array :"+arr);
        int X =55;
        int firstElement=0,secondElement=0,thirdElement=0;
        boolean contains=false;
        for(int i=0; i< arr.size(); i++){
            for(int j=0; j< arr.size(); j++){
                int required =X- (arr.get(i) + arr.get(j));
                if(arr.contains(required)){
                    contains=true;
                    firstElement=arr.get(i);
                    secondElement=arr.get(j);
                    thirdElement=required;

                }
            }
        }if(contains){
            System.out.println("Triplet found : "+firstElement+", "+secondElement+", "+thirdElement);
        }else {
            System.out.println("Triplet not found !!");
        }
    }
}
