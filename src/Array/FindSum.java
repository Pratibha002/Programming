package Array;

public class FindSum {
    public static void main(String[] args) {
        int [] a = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        int left =a[0];
        int right=a[a.length-1];
        int sum=0;

        for (int i=0; i<a.length; i++){
            for (int j=i; j<a.length; j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }

    }
}
