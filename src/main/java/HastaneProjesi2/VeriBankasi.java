package HastaneProjesi2;

public class VeriBankasi {


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

    void yakakarti(){

        System.out.println("Ad:"+ad);
        System.out.println("Soyad:"+soyad);
        System.out.println("Kimlik no:"+kimlikno);
    }


}
