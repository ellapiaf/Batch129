package ssgmentoring.ifstatementsternary3;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%2!=0) {
            System.out.println("sayi tek");
        }





    }
}
