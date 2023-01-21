package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*
    Numaric primitive data type'larinin birbirine donmusturulmesine "Type Casting" denir.
    Numaric (Sayisal) Data Typ'lar byte-short-int-long-float-double


    note 1:Kucuk data Type'larini buyuk data type'larina ceviirmayi Java otomatik olarak yapabilir.
           Bu isleme"AutoWidening" (OtomatiK Genisletme) denir.
    Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
          Bu işlemi kod yazanlar yapar.
          Bu isleme "ExplicitNarrowing"     (Aciktan daraltma) denir.
     */
    public static void main(String[] args) {



        //byte data type'ini int data type'ina ceviriniz.
        byte age =13;
        int ageInt=age;// AutoWidening
        System.out.println(ageInt);

        //long data'type ni short data type 'ina cevirelim.

        long weight=234;

        short weightShort=(short)weight;

        //int data type'ini float data type'ina ceviriniz.

        int size =166;

        float sizeFloat=size;
        System.out.println(sizeFloat);

        double size1= 333.56;
        short sizeShort= (short) size1;

        System.out.println(sizeShort);

        //Dikkat!
        // dONUSUM YAPTIGINIZ SAYI(260) ,donuseceginiz data type'nin sinirlari disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucu sizin yeni degeriniz olur.

        //Example 1:
         short num=260;

         byte numByte=(byte)num;

        System.out.println(numByte);

        //Example 2:
        short n=1023;
        System.out.println(n);//1023

        byte nByte=(byte) n;
        System.out.println(nByte);//-1


    }

}
