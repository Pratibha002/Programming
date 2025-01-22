package Iterator;
import java.lang.reflect.Array;
//sort method is inside collections class ,collections class is present inside the java.util package
import java.util.ArrayList;
import java.util.Collections;

public class MP4 {
    public static void main(String[] args) {

        Song song1 =new Song("take me to your heart", "Michael Learns", 2014 );
        Song song2 =new Song("See you again ", "Wiz", 2015 );
        Song song3 =new Song("love me like you do", "Ellie Goulding", 2013 );
        Song song4 =new Song("just a dream ", "Nelly ", 2010 );
        Song song5 =new Song("as long as you love me", "Backstreet boys", 2008 );

        ArrayList<Song> musicList =new ArrayList<>();
        musicList.add(song1);
        musicList.add(song2);
        musicList.add(song3);
        musicList.add(song4);
        musicList.add(song5);

        utilityClass.iterateList(musicList);
//        Collections.sort(musicList);
//        System.out.println("After Sorting by title");
//        utilityClass.iterateList(musicList);

//        for(Song s:musicList) {
//            System.out.println(s);
//        }

        //normal sort
//       Collections.sort(musicList);

        //Sort by Comparator
        Collections.sort(musicList, new SortByArtistComparator());
      // Collections.sort(musicList, new SortByYearComparator());

      //  System.out.println("After Sorting by year");
      System.out.println("After Sorting by Artist");
//        System.out.println("After Sorting by title");

//        for(Song s:musicList) {
//            System.out.println(s);
//        }

        utilityClass.iterateList(musicList);

    }
}
/*comparator is used when we want to perform sorting our requirement
comparable interface is present inside the java.lang package, and it has only one method
 public int compareTo(T o); method, this method return an integer value -ve, +ve and 0

 */