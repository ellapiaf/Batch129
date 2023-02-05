package hastaneprojesi3;

import java.util.ArrayList;

public class VeriBankasi {
//    public static void doktorIsimleri() {
//
//        String isim = "";
//        Doktor doktor=new Doktor();
//        ArrayList<String> doctorIsimleri = new ArrayList<>();
//
//        doktor.setIsim(isim);
//        doctorIsimleri.add("Nilson");
//        doctorIsimleri.add("John");
//        doctorIsimleri.add("Robert");
//        doctorIsimleri.add("Marry");
//        doctorIsimleri.add("Alan");
//        doctorIsimleri.add("Mahesh");
//    }
//
//    public static void doktorSoyisimleri() {
//
//        ArrayList<String> doktorSoyisimleri = new ArrayList<>();
//
//        doktorSoyisimleri.add("Avery");
//        doktorSoyisimleri.add("Abel");
//        doktorSoyisimleri.add("Erik");
//        doktorSoyisimleri.add("Jacob");
//        doktorSoyisimleri.add("Pedro");
//        doktorSoyisimleri.add("Mahesh");
//    }
//
//    public static void unvanlar() {
//
//        ArrayList<String> unvanlar = new ArrayList<>();
//
//        unvanlar.add("Allergist");
//        unvanlar.add("Norolog");
//        unvanlar.add("Genel cerrah");
//        unvanlar.add("Cocuk doktoru");
//        unvanlar.add("Dahiliye");
//        unvanlar.add("Kardiolog");
//    }
//
//    public static void hastaIsimleri() {
//
//        ArrayList<String> hastaIsimleri = new ArrayList<>();
//
//        hastaIsimleri.add("Warren");
//        hastaIsimleri.add("Petanow");
//        hastaIsimleri.add("Sophia");
//        hastaIsimleri.add("Emma");
//        hastaIsimleri.add("Darian");
//        hastaIsimleri.add("Peter");
//
//    }
//
//    public static void hastaSoyIsimleri() {
//
//        ArrayList<String> hastaSoyIsimleri = new ArrayList<>();
//
//        hastaSoyIsimleri.add("Traven");
//        hastaSoyIsimleri.add("William");
//        hastaSoyIsimleri.add("George");
//        hastaSoyIsimleri.add("Tristan");
//        hastaSoyIsimleri.add("Luis");
//        hastaSoyIsimleri.add("Cole");
//    }
//
//    public static void durumlar() {
//
//        ArrayList<String> durumlar = new ArrayList<>();
//
//        durumlar.add("Allerji");
//        durumlar.add("Bas agrisi");
//        durumlar.add("Diabet");
//        durumlar.add("Soguk alginligi");
//        durumlar.add("Migren");
//        durumlar.add("Kalp hastaliklari");
//    }
//
//    public static void hastaIDleri() {
//
//        ArrayList<Integer> hastaIDleri = new ArrayList<>();
//
//        hastaIDleri.add(111);
//        hastaIDleri.add(222);
//        hastaIDleri.add(333);
//        hastaIDleri.add(444);
//        hastaIDleri.add(555);
//        hastaIDleri.add(666);
    // }

    private String ad;
    private String soyad;
    private int kimlikno;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(int kimlikno) {
        this.kimlikno = kimlikno;
    }

    public VeriBankasi(String ad, String soyad, int kimlikno) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikno = kimlikno;


    }

    void yakakarti() {

        System.out.println("Ad:Avery" + ad);
        System.out.println("Soyad:Abel" + soyad);
        System.out.println("Kimlik no:1" + kimlikno);
    }



}