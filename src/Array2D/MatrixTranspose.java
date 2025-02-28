package Array2D;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
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
        }
        System.out.println("TRANSPOSE OF MATRIX: ");
        for (int j=0; j<cols; j++){
            for (int i=0; i<rows; i++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
