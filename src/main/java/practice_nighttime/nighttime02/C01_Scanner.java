package practice_nighttime.nighttime02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Scanner {

    /*


    TechProED spor salonu icin isism, soyisim;yas;
    kilo,boy,salona devam edecegi ay suresi bilgilerini alip aylik 20  $ olarak toplam ucreti  yazdiriniz.

     */
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen isim, soyisim bilgisini giriniz :");
        String isimSoyisim =input.nextLine();

        System.out.println("Lutfen yas bilgisini giriniz :");
        byte  yas =input.nextByte();

        System.out.println("Lutfen kilo bilgisini giriniz :");
        double kilo=input.nextDouble();
        System.out.println("Lutfen boy  bilgisini giriniz :");
        double boy =input.nextDouble();

        int aylikUcret=20;
        System.out.println("aylik_ucret="+aylikUcret+" $");

        System.out.println("Lutfen uyelik suresini  giriniz :");
        int aylik=input.nextInt();

        int toplam_tutar=aylikUcret*aylik;

        System.out.println("toplam_tutar = " + toplam_tutar+" $");
        System.out.println("tamIsim = " + isimSoyisim +"\nYasiniz:" +yas+"\nKilo:"+kilo+ "\nBoy :"+boy+"\nOdemeniz gereken tutar :"+aylikUcret);
    }


}
