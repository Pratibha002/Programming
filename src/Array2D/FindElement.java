package Array2D;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROW AND COLUMN: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        boolean found = false;

        int [][] a = new int[rows][cols];
        System.out.println("ENTER THE ARRAY ELEMENTS: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMENT WHICH YOU HAVE TO FIND: ");
        int x =sc.nextInt();

        //to print o/p
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){

                if (a[i][j]==x){
                    System.out.println("ELEMENT FOUND AT LOCATION: ("+ i+ " , "+ j+") ");
                    found=true;
                }

            }
//            if (found){
//                break;
//            }
//            If we use the break statement, only the first occurrence of the element will be printed.
//            However, if we omit the break statement, all occurrences of the element will be found and printed,
//            even if the element found in multiple positions.....

        }if (!found){
            System.out.println("ELEMENT NOT FOUND!!!");
        }

    }
}
