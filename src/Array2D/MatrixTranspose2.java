package Array2D;

import java.util.Scanner;

public class MatrixTranspose2 {
    public static void main(String[] args) {
        int [][] arr = takeInput();
        transpose(arr);
    }

    public static int[][] takeInput() {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE NO. OF ROW AND COLUMN: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] a = new int[rows][cols];
        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                a[i][j]=sc.nextInt();
            }
        }return a;
    }
    public static void transpose(int[][]a){
        int rows = a.length;
        int cols = a[0].length;//a[0]first row, a[0].length=>gives number of cols in the 1st row

        // Print the transpose of the matrix
        System.out.println("TRANSPOSE OF MATRIX: ");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
