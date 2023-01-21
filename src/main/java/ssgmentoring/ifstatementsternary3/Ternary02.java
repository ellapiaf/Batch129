package ssgmentoring.ifstatementsternary3;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        Object s=sayi % 2 == 0 ? "cift sayi" : "tek sayi";
        System.out.println(s);

  //      2.yol:

        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");

    }
}
