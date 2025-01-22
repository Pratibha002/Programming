package Iterator;

public class Song implements Comparable<Song> {
    //comparable is used for natural sorting, in ascending order... it is heavily used for this particular thing

        private String title;
        private String artist;
        private Integer year;

    public Song(String title, String artist, Integer year) {
        this.title=title;
        this.artist=artist;
        this.year=year;

    }

    public String getTitle(){
            return title;
        }
        public void setTitle(){
            this.title=title;
        }
        public String getArtist(){
            return artist;
        }
        public void setArtist(){
            this.artist=artist;
        }
        public int getYear(){
            return year;
        }
        public void setYear(){
            this.year=year;
        }
    @Override
    public String toString() {
        return "Song{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", year=" + year + '}';
    }

    @Override
    /*we can tell java, how we want to sort by using compareTo()
    sort() will use compareTo() internally to sort the song objects
     */
    public int compareTo(Song o) {
        return -this.getYear();
        //return -this.getTitle().compareTo(o.getTitle());
        // if we want to do sorting in descending order so we have to put - sign before this
        //return 0;
    }
}
