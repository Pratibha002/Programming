package HashMap;

public class PairWithSum {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
        int key = 7;
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==key){
                    System.out.println(arr[i]+" "+arr[j]);

                }

            }

        }

    }
}

//9753776018