package day03Scanner;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01Tekrar {

    public static void main(String[] args) {


        //Kullanicidan data alip kodlarimizda kullanacagiz
        //1.adim: Scanner Class'dan object olustur
        Scanner input = new Scanner(System.in);
        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("lUTFEN YASINIZI GRINIZ...");

        //3.adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        int age = input.nextInt();
        System.out.println(age);

    }
}