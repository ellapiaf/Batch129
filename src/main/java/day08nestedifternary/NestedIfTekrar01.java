package day08nestedifternary;

import java.util.Scanner;

public class NestedIfTekrar01 {

    public static void main(String[] args) {


        /*Example 1: Kullanicidan 3 tane  sayi aliniz.
//                Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
//        Eger ucgen ise ; "eskenar" Ucgen olma durumunu  kontrol ediniz.
//        INFO :
//        Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
//        herhangi iki kenar farki ucuncu  kenardan kucuk olmali
//        a+b>c>a-b
//        a+c>b>a-c
//        b+c>a>b-c
//        a=b=c ise eskenar ucgen

         */

        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");
     double a =Math.abs(input.nextDouble());//!!!!negatif bir sayi verirse kullanici bunun icin Math.abs ekledik !!!!
     double b = Math.abs(input.nextDouble());//!!!!negatif bir sayi verirse kullanici bunun icin Math.abs ekledik !!!!
     double c = Math.abs(input.nextDouble());//!!!!negatif bir sayi verirse kullanici bunun icin Math.abs ekledik !!!!

     if((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c)))  {  //note 1:burada Math.abs kullandik cunku a-b nin sonucu -2 cikiyor bunu mutlak deger olarak pozitif sayiya cevirmek istedik bu yuzden math.abs kullandik.

// note 2 : ucgen olmak icin yukarida verilen kurallarin ucunun de dogru olmasi gerekir.kurallarin tamamanin dogru olmasi gerektiginde %% (and) kullanin .||(veya) kullanmayin.
     if(a==b && b==c && a==c){
      System.out.println("sen eskenar ucgensin...");
    }else{
    System.out.println("ucgen ama eskenar degil..");
    }
         System.out.println("Sen ucgensin...");
     }else{
         System.out.println("sen ucgen degilsin..");
     }







    }
}
