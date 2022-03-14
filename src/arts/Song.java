package arts;

import java.util.Date;
import jobs.Artist;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Song {
    private String title;
    private final Artist artist;
    private Date release;

    public Song(String inputTitle, Artist inputArtist, String _release) throws ParseException{
        title = inputTitle;
        artist = inputArtist;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        release = format.parse(_release);
    }

    public void setTitle(String judul){
        title = judul;
    }

    public void SetArtist(Artist artist){
        Artist artis;
    }

    public void setRelease_1302204009(Date launching){
        release = launching;
    }

    public String getTitle(){
        return title;
    }

    public Artist getArtist(){
        return artist;
    }

    public Date getRelease(){
        return release;
    }

    public void displayInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Artist: " + artist.getName());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = format.format(release);
        int bulan = Integer.parseInt(strDate.substring(4, 6));

        switch (bulan) {
            case 1:
                strDate = strDate.substring(8, 10) + "Januari" + strDate.substring(0, 4);
                break;
            case 2:

                strDate = strDate.substring(8, 10) + "Februari" + strDate.substring(0, 4);
                break;
            case 3:

                strDate = strDate.substring(8, 10) + "Maret" + strDate.substring(0, 4);
                break;
            case 4:

                strDate = strDate.substring(8, 10) + "April" + strDate.substring(0, 4);
                break;
            case 5:

                strDate = strDate.substring(8, 10) + "Mei" + strDate.substring(0, 4);
                break;
            case 6:

                strDate = strDate.substring(8, 10) + "Juni" + strDate.substring(0, 4);
                break;
            case 7:

                strDate = strDate.substring(8, 10) + "Juli" + strDate.substring(0, 4);
                break;
            case 8:

                strDate = strDate.substring(8, 10) + "Agustus" + strDate.substring(0, 4);
                break;
            case 9:

                strDate = strDate.substring(8, 10) + "September" + strDate.substring(0, 4);
                break;
            case 10:

                strDate = strDate.substring(8, 10) + "Oktober" + strDate.substring(0, 4);
                break;
            case 11:

                strDate = strDate.substring(8, 10) + "November" + strDate.substring(0, 4);
                break;
            case 12:

                strDate = strDate.substring(8, 10) + "Desember" + strDate.substring(0, 4);
                break;
            default:
                break;
        }
        System.out.println("Artist age is " + artist.getAge() + " when song launching? ");
        System.out.println("Launching: " + strDate);
    }
}
