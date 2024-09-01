package Iterator;

import java.util.ArrayList;

public class utilityClass {
   /* private static void iterateList(ArrayList<Integer> al) { make it public
    in utility class we write all the common methods which we required in every program
     but there is a  problem what if we need another type instead of Integer for that we make new method
     so the answer is no. we use the generic, so it can handle this kind of problem we can use any type so for
     that we have to modify our method
     instead of this :
     public static void iterateList(ArrayList<Integer> al) {
        for(Integer i : al){
       }
     I have to write like that, which is given below:
     instead of T we can write anything because now it become object that's the beauty of object, generic
     "public static <T> void iterateList(ArrayList<T> al) { //some code}" this is a generic method which can ha
     handle any kind of list(if it is integer, float, double, string, etc..)
    */
   public static <T> void iterateList(ArrayList<T> anyList) {
       for(T i : anyList){
           System.out.println(i);
       }

    }
}
