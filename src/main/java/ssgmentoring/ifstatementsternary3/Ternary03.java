package ssgmentoring.ifstatementsternary3;

import java.util.Scanner;

public class Ternary03 {

    public static void main(String[] args) {

      //Bir tamsayı pozitifse "Tamsayı pozitiftir" yazdırın, aksi takdirde "Tamsayı pozitif değil" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi > 0 ? "tam sayi pozitif" : "tamsayi pozitif degil");
    }
}
