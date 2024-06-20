package Array;

public class MaxProductOfConsecutiveSubArray {
    public static void main(String[] args){
        int [] a ={2,4,6,8,9};
        int temp=0;
        int maxProduct=0;


        for(int i=0; i<a.length-1;i++){
            temp=a[i];
            int product=temp*a[i+1];
            System.out.println("Consecutive Product of subArray: "+a[i]+" * "+ a[i+1]+ " = " +product);
            if(product>maxProduct){
                maxProduct=product;

            }
        }System.out.println("Maximum Product of Consecutive subArray : "+maxProduct);
        System.out.println("=============================================================================== ");
        int [] a2={9,6,21,12,13};
        int temp2=0;
        int maxProduct2=0;

        for(int i=0; i<a2.length-1;i++){
            temp2=a2[i];
            int product2=temp2*a2[i+1];
            System.out.println("Consecutive Product of subArray: "+a2[i]+" * "+ a2[i+1]+ " = " +product2);
            if(product2>maxProduct2){
                maxProduct2=product2;

            }
        }System.out.println("Maximum Product of Consecutive subArray : "+maxProduct2);


    }
}
