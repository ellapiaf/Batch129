package day03Scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
       // rakamlari toplamini yazdiran kodu yaziniz
       // note : bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolun kalana bakin
        //note: bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tamsayi yapar.
        // peki java sonucu nasil tam sayi yapar ? Ondalik kismi iptal eder.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 5  basamakli sayi giriniz ...");
        int number   =  input.nextInt();
        //son rakami al
        int lastDigit=number%10;

        System.out.println(lastDigit);

        number=number/10;
        System.out.println(number);

     //Sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

    }
}
