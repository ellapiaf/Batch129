package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
     Gecerli  Username ="admin" ve Password="pwd123 dur.
     Kullanicidan Username ve Password'u alin.
     Username ve Password dogru ise  "HESABINIZA HOSGELDINIZ!" yazdirin.
     Username veya Password yalnis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
     Username veya  Password 4.kere yalnis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.


         */

        Scanner input = new Scanner(System.in);




        int counter=0;


        do{
            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'i giriniz...");
            String password = input.next();

           if (username.equals("admin")&& password.equals("pwd123")){
               System.out.println("Hesabiniza hosgeldiniz!");
               break;
           }
         counter++;

        }while(true);






    }
}
