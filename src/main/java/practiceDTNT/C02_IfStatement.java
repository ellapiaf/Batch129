package practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan alcaginiz iki sayiyui yine kullaniciya sectirecceginiz ,
        dort islemden bir ile isleme koyup yazdiriniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \ntoplama yapmak icin 1 \n cikarema yapmak icin 2 \n carpma yapmak icin 3\n bolme yapmak icin 4\n giriniz ");// Kullaniciya secmesi icin menu olsuturdum.

        int islem = input.nextInt();
        System.out.println("Lutfden iki tam sayi giriniz :...");

        double num1 = input.nextDouble();// 1.sayi assign edildi.
        double num2 = input.nextDouble();//2.sayi assign edildi.


        if (islem == 1) {
            System.out.println("Toplama isleminin sonucu:" + num1 + " +  " + num2 + "=" + (num1 + num2));


        } else if (islem == 2) {
            System.out.println("cikarma isleminin sonucu:" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("carpma isleminin sonucu:" + num1 + "x" + num2 + "=" + (num1 * num2));
        } else if (islem == 4) {
            System.out.println("bolme isleminin sonucu:" + num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
            System.out.println("Hatali secim yaptiniz...Tekrar deneyiniz");
        }


    }
}
