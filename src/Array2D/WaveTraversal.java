package Array2D;

public class WaveTraversal {
    public static void main(String[] args) {
       int [][] a = MatrixTranspose2.takeInput();
       waveTraverse(a);
    }
    public static void waveTraverse(int [][] a){
        System.out.println("WAVE TRAVERSE.........");
        int topRow = 0;
        int leftCol = 0;
        int bottomRow = a.length-1;
        int rightCol = a[0].length-1;

        for (int j=leftCol; j<=rightCol; j++){
            if (j % 2 == 0){ //EVEN COLUMN INDEX
                //evenCol -> topRow to bottomRow
                for (int i=topRow; i<=bottomRow; i++){
                    System.out.print(a[i][j]+" ");
                }
            }else { //ODD COLUMN
                //oddCol ->bottomRow to topRow
                for (int i=bottomRow; i>=topRow; i--){
                    System.out.print(a[i][j]+" ");
                }
            }

        }
    }
}
