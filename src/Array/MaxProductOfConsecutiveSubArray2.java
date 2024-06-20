package Array;

public class MaxProductOfConsecutiveSubArray2 {
//      int [] arr ={2,4,6,8,9};
//      int [] arr={9,6,21,12,13};
       int maxProduct=0;

    public void MaxProduct(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int temp=arr[i];
            int product=temp*arr[i+1];
            System.out.println("Consecutive Product of subArray: "+arr[i]+" * "+ arr[i+1]+ " = " +product);
            if(product>maxProduct){
                maxProduct=product;

            }
        }System.out.println("Maximum Product of Consecutive subArray : "+maxProduct);
        System.out.println("=============================================================================== ");

    }
    public static void main(String[] args){
        MaxProductOfConsecutiveSubArray2 obj =new MaxProductOfConsecutiveSubArray2();
        int [] a ={2,4,6,8,9};
        int [] a2={9,6,21,12,13};
        obj.MaxProduct(a);
        obj.MaxProduct(a2);



    }
}
