package Array2D;

import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols= sc.nextInt();

        int [][] arr = new int[rows][cols];

//        int arr[][] = {{1,2,3,4,5},{6,7,8,9},{9,8,7,6}};

        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTERED ARRAY ELEMENTS: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
