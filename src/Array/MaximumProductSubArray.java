//find maximum product subArray
package Array;

import java.util.Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args){
//         int [] arr ={34,2,54,8,4,9};
         int [] arr3 ={-34,0,-54,8,4,9};
//         boolean foundPair=false;
         int negativeNumberCount=0;

         Arrays.sort(arr3);//[2, 4, 8, 9, 34, 54]
         int product=1;// here we will have to include all the values for creating maximum product of subArray.
         System.out.println("Sorted Array : "+Arrays.toString(arr3));
//         int [] arr2 =Arrays.copyOfRange(arr3,3,arr3.length);
//         System.out.println("Sub Array : "+Arrays.toString(arr2));
         for( int i=0; i<arr3.length; i++){
             if(arr3[i]>0) {
                 product *= arr3[i];
             }else if(arr3[i]<0) {
                negativeNumberCount++;
             }
         } if(negativeNumberCount%2==0){
            for(int i=0; i< arr3.length;i++){
                if(arr3[i]<0){
                    product*=arr3[i];
                }
            }
        }


         System.out.println("Maximum Product of SubArray : "+product);

    }
}
