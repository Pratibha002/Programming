package Array2D;

import java.util.Scanner;
//generate the n x n matrix
public class GenerateSpiral {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER 'N' : ");
        int n=s.nextInt();

        int [][]matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
    public static void printMatrix(int [][] a){
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiralMatrix(int n){
        int [][] matrix = new int[n][n];
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = n-1;
        int rightCol = n-1;
        int curr = 1;

        while (curr <= n*n  ) {

            //top row ->leftCol to rightCol
            for (int j=leftCol; j<=rightCol && curr<=n*n; j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;

            //right column -> topRow to bottomRow
            for (int i=topRow; i<=bottomRow && curr <= n*n; i++){
                matrix[i][rightCol]= curr;
                curr++;
            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for (int j=rightCol; j>=leftCol && curr < n*n; j--){
                matrix[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;

            //left column ->bottomRow to topRow
            for (int i=bottomRow; i>=topRow && curr < n*n; i--){
                matrix[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }

        return matrix;
    }
}
