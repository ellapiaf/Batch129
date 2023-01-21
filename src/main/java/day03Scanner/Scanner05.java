package day03Scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)alanini hesaplayiniz==> kisa kenar*uzun kenar
        //ii)cevresini hesaplayiniz ==>2*kisa kenar+ 2*uzun kenar

        Scanner input=new Scanner(System.in);
        System.out.println("Diktorgenin kisa kenar uzunlugunu giriniz...");
        float shortside =  input.nextFloat();
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz..");
        float longSide=input.nextFloat();

        System.out.println("Alan=" + (shortside*longSide));
        System.out.println("cevre=" + (2*shortside + 2*longSide));

    }
}
