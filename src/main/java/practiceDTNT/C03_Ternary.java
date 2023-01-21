package practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan sifirdan buyuk pozitif bir tam sayi girilmesini isteyin.
        Girilen pozitif tamsayi  3 basamakli ise ekrana "3 basamakli" yazdiirin.
        3 basamalio degil ise ; cift olup olmadigini kontrol edin.
        cift ise " 3 basamakli olmayan cift sayi " yazdirin.
        cift degil ise ; "3 basamakli olmayan tek sayi " yazdirin.
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz...");

        int sayi=input.nextInt();

        System.out.println("********** if ile cozumu ************");

        if(sayi>0){
            boolean sifirdanBuyukUcBas=sayi>99 && sayi<1000;
            boolean sifirdanBuyukUcBasOlmayanCiftSayi=!(sayi>99 && sayi<1000) && sayi%2==0;
         if(sifirdanBuyukUcBas){
             System.out.println("3 basamakli sayi");
         }else if(sifirdanBuyukUcBasOlmayanCiftSayi) {
         }else {
             System.out.println("3 basamakli olmayan pozitif tek sayi");
         }
        }else{
            //negatif sayilar icin burasi calisir.
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }


    }
}
