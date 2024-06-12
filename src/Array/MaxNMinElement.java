package Array;

public class MaxNMinElement {
    public static void main(String[] args){
        int [] arr ={34,2,54,8,4,9};
        int maxElement=arr[0];
        int minElement=arr[0];
        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
            if(maxElement < arr[i]){
                arr[i]=maxElement;
            }
        }System.out.println("MAXIMUM ELEMENT : "+maxElement);
        for(int i=0; i<arr.length;i++) {
//            System.out.println(arr[i]);
            if (minElement > arr[i]) {
                minElement=arr[i];
            }
        }
        System.out.println("MINIMUM ELEMENT : " + minElement);
    }
}
