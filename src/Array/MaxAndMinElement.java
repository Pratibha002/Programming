package Array;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int [] a ={4,5,3,1,7,19,10,8,15};

        int minElement=a[0];
        int maxElement=a[0];
        int temp=0;

        for(int i=0; i<a.length; i++){
            if(minElement>a[i]){
                minElement=a[i];
            }
            if (maxElement<a[i]){
                maxElement=a[i];
            }
        }
        System.out.println("MINIMUM ELEMENT OF AN ARRAY: "+minElement);
        System.out.println("MAXIMUM ELEMENT OF AN ARRAY: "+maxElement);

    }
}
