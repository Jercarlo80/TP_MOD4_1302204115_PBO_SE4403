package jobs;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Artist {
    private String name;
    private Date birthdate;
    private int age;

    public Artist(String inputNama, String date) throws ParseException {
        name = inputNama;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        age = 2021 - Integer.parseInt(date.substring(0,4));
        birthdate = format.parse(date);
    }
    public void setName(String nama_penyanyi) {
        name = nama_penyanyi;
    }
    public void setBirthdate(Date ultah_pernyanyi) {
        birthdate = ultah_pernyanyi;
    }
    public void setAge(int umur_penyanyi) {
        age = umur_penyanyi;
    }
    public String getName() {
        return name;
    }
    public String getBirthDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = format.format(birthdate);
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
        return strDate;
    }
    public int getAge() {
        return age;
    }
    public void displayInfo() {
        System.out.println("Artist: " + getName());
        System.out.println("Birthdate: " + getBirthDate());
        System.out.println("Age: " + getAge());
    }
}
