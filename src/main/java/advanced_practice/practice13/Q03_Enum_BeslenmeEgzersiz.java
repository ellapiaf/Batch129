package advanced_practice.practice13;

import org.example.Main;

public class Q03_Enum_BeslenmeEgzersiz {

    //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
    //20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.

    public static void main(String[] args) {

//        System.out.println("BeslenmeEgzersiz.Ocak.toplamEgzersizSaati=" +BeslenmeEgzersiz.Ocak.toplamEgzersizSaati );
//        System.out.println(BeslenmeEgzersiz.Ekim.ayinMeyvesi);
//        System.out.println("BeslenmeEgzersiz.valueOf(\"Mart\").ayinMeyvesi = " + BeslenmeEgzersiz.valueOf("Mart").ayinMeyvesi);


        for(BeslenmeEgzersiz w : BeslenmeEgzersiz.values()){
            if(w.toplamEgzersizSaati>20){
                System.out.println(w);
            }
        }
    }

}
