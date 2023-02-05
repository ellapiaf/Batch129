package HastaneProjesi2;

public class Bashekim extends VeriBankasi {

    private String unvan;
    private String uzmanlikalani;
    private int hizmetsuresi;

    public Bashekim(String ad, String soyad, int kimlikno, String unvan, String uzmanlikalani, int hizmetsuresi) {
        super(ad, soyad, kimlikno);
        this.unvan = unvan;
        this.uzmanlikalani = uzmanlikalani;
        this.hizmetsuresi = hizmetsuresi;


    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getUzmanlikalani() {
        return uzmanlikalani;
    }

    public void setUzmanlikalani(String uzmanlikalani) {
        this.uzmanlikalani = uzmanlikalani;
    }

    public int getHizmetsuresi() {
        return hizmetsuresi;
    }

    public void setHizmetsuresi(int hizmetsuresi) {
        this.hizmetsuresi = hizmetsuresi;
    }

    @Override
    void yakakarti() {
        super.yakakarti();
        System.out.println("unvan:"+unvan);
        System.out.println("uzmanlikalani:"+uzmanlikalani);
        System.out.println("hizmetsuresi:"+hizmetsuresi);
    }
}

