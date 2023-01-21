package practiceDTNT;

import java.util.Scanner;

public class c01_IfStatement {

    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin eger gun cuma ise "Muslumanlar icin mubarek gun" ;

        eger guhn cumartesi ise "Yahudiler icin kutsal Gun" ;

        eger gun pazar ise "Hristiyanlar icin kutsal  gun" yazdiran kodu olusturun.
         */

        Scanner input = new  Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        String gun =input.next().toLowerCase();// Kucuk harfe cevirdik

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar Icin Kutsal Gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristyanlar icin Kutsal Gun");
        } else
            System.out.println("Kutsal Gun Degil");

    }
}
