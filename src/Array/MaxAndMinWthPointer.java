package Array;

public class MaxAndMinWthPointer {
    public static void main(String[] args) {
        int [] a ={4,5,3,1,7,19,10,8,15};

        int left=0;
        int right=a.length-1;
        int minElement=a[0];
        int maxElement=a[0];

        while (left<=right){
            if(a[left]<minElement ){
                minElement=a[left];

            }
            if (a[left]>maxElement){
                maxElement=a[left];
            }
            if(a[right]<minElement ){
                minElement=a[right];

            }
            if (a[right]>maxElement){
                maxElement=a[right];
            }
            left++;
            right--;


        }
        System.out.println("MINIMUM ELEMENT OF AN ARRAY: "+minElement);
        System.out.println("MAXIMUM ELEMENT OF AN ARRAY: "+maxElement);
    }
}
