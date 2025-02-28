package Sliding_Window;

public class SubArrayMaxElement {
    public static void main(String[] args) {
        int [] a = {2,4,5,67,8,9,4,21};
        int n =a.length;
        int k=3; //window size
        int left =0;
        int right=k-1;//right pointer end of the window, 3-1 =2==> traverse 0,1,2

        // Continue sliding the window until the right pointer reaches the end of the array
        while (right < n ){
            int maxElement=0;
            // Iterate over the window and find the maximum element
            for(int i=left; i<=right; i++){
                maxElement=Math.max(maxElement,a[i]);
            }
            System.out.println(maxElement);// Output the max element of the current window

            left++;
            right++;
        }
    }
}
/* ==========================brute force==========================
int [] a = {2,4,5,67,8,9,4,21};
        int k=3; //k is a size of subArray.

        for(int i=0; i<=a.length-k; i++){
            int maxElement =0;

            for(int j=i; j<i+k; j++){
                maxElement=Math.max(maxElement, a[j]);
            }
            System.out.println(maxElement);
        }
 */