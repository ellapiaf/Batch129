package hastaneprojesi;

public class Hasta {

    int hastaId;
    String isim;
    String soyisim;

    public Hasta(int hastaId,String isim,String soyisim){

        this.isim=isim;
        this.soyisim=soyisim;

        this.hastaId=hastaId;


    }

    public String toString(){

        return "Hata Bilgileri:" +
                "Isim="+isim  +
                "soyisim="+ soyisim +
                "hasta id numarasi="+hastaId;
    }
}
