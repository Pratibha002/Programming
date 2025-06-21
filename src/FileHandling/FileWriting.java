package FileHandling;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("F:\\DSA(NOTES_Ruchi)\\FileHandlingLearning");

            try {

                System.out.println("learning file handling in java...!");

            }finally {
               f.close();
            }
            System.out.println();
        }catch (IOException i){
            System.out.println(i);
        }

    }


}
