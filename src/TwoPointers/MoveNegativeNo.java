package TwoPointers;
//move all the negative elements to one side of the array
public class MoveNegativeNo {
    public static void main(String[] args) {
        int []a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int left=0;
        int right=a.length-1;
        int temp=0;

        while (left<=right){
            if (a[left]>0 && a[right]<0){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;

            }
            if (a[left]<0){
                left++;

            }
            if (a[right]>0){
                right--;
            }
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
