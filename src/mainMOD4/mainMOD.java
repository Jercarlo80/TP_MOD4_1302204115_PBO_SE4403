package mainMOD4;

import arts.Song;
import  jobs.Artist;

public class mainMOD {
    public static void main(String[] args) throws Exception {
        Artist x = new Artist("budi doremi", "1984-09-19");
        Artist y = new Artist("ed sheeran", "1991-02-17");
        x.displayInfo();
        System.out.println();
        y.displayInfo();
        System.out.println();

        Song song1 = new Song("melukis senja", x, "2020-06-29");
        Song song2 = new Song("photograph", y, "2015-05-10");
        song1.displayInfo();
        System.out.println();
        song2.displayInfo();
        System.out.println();
    }
}
