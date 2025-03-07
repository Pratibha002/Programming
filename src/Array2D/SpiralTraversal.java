package Array2D;

public class SpiralTraversal {
    public static void main(String[] args) {
        int [][] a = MatrixTranspose2.takeInput();
        spiralTraversalLeftToRight(a);
        System.out.println();
        spiralTraversalTopToBottom(a);
    }
    public static void spiralTraversalLeftToRight(int[][] a){
        System.out.println("TRAVERSAL LEFT TO RIGHT.......");
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = a.length-1;
        int rightCol = a[0].length-1;
        int count = 0;
        int totalElements = a.length * a[0].length;//a[0].length ->represents the column

        while (count < totalElements  ) {

            //top row ->leftCol to rightCol, i for row, j for column
            // && count < totalElements: We add this condition in each loop to ensure that we do not print more elements than the total number of elements in the matrix.
           // Without this check, the program might continue printing duplicate elements as the spiral traversal could revisit elements already printed.

            for (int j=leftCol; j<=rightCol && count < totalElements; j++){
                System.out.print(a[topRow][j]+ " ");
                count++;
            }
            topRow++;

            //right column -> topRow to bottomRow
            for (int i=topRow; i<=bottomRow && count < totalElements; i++){
                System.out.print(a[i][rightCol]+" ");
                count++;
            }
            rightCol--;

            // bottom row -> rightCol to leftCol
            for (int j=rightCol; j>=leftCol && count < totalElements; j--){
                System.out.print(a[bottomRow][j]+" ");
                count++;
            }
            bottomRow--;

            //left column ->bottomRow to topRow
            for (int i=bottomRow; i>=topRow && count < totalElements; i--){
                System.out.print(a[i][leftCol]+" ");
                count++;
            }
            leftCol++;
        }
    }
    public static void spiralTraversalTopToBottom(int[][] a){
        System.out.println("TRAVERSAL TOP TO BOTTOM.......");
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = a.length-1;
        int rightCol = a[0].length-1;
        int count = 0;
        int totalElements = a.length * a[0].length;//a[0].length ->represents the column

        while (count < totalElements  ) {

            //left column ->topRow to bottomRow, i for row, j for column
            for (int i=topRow; i<=bottomRow && count < totalElements; i++){
                System.out.print(a[i][leftCol]+ " ");
                count++;
            }
            leftCol++;

            //bottom row -> leftCol to rightCol
            for (int j=leftCol; j<=rightCol && count < totalElements; j++){
                System.out.print(a[bottomRow][j]+" ");
                count++;
            }
            bottomRow--;

            // right column -> bottomRow to topRow
            for (int i=bottomRow; i>=topRow && count < totalElements; i--){
                System.out.print(a[i][rightCol]+" ");
                count++;
            }
            rightCol--;

            //top row -> rightCol to leftCol
            for (int j=rightCol; j>=leftCol && count < totalElements; j--){
                System.out.print(a[topRow][j]+" ");
                count++;
            }
            topRow++;
        }
    }
}
