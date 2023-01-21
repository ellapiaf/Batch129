package ssgmentoring.ifstatementsternary3;

public class Ternary01 {

    public static void main(String[] args) {

        // note ternarylerde output olarak ya true cikar ya da false cikar



        // verilen sayi 100'den buyukse sayi’nin karesini  alip yazdiran
        // 100'den kucukse ” sayi 100'den buyuk olmali” yazdiran
        // bir ternary olusturalim

     int sayi =120;
//
//Object num =   sayi>100 ? sayi*sayi : "sayi 100' den buyuk olmali"; // bu kisim da object kullandik cunku int yaparsak string oldugu icin koce hata veriyor
//        System.out.println(num);                                        //string yaparsan int kodun hata veriyor bu yuzden object kullandik.


       // 2.yol istersen eger butun ternry kismini alip saout icine yazdirabiulirsin

        System.out.println(sayi>100 ? sayi*sayi : "sayi 100' den buyuk olmali");

    }
}
