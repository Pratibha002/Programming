package Array;

public class ReverseAnArray {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6};
        int temp=0;
        System.out.println("ORIGINAL ARRAY : ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i< (arr.length)/2; i++){
           // System.out.print(arr[i]+" ");
            temp=arr[i];
           arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(" ");
        System.out.println("SWAPPED ARRAY : ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
