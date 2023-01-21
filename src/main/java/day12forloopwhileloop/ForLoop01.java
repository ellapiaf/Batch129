package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {

    public static void main(String[] args) {
        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column = input.nextInt();
        System.out.print("Lütfen cizilmesini istediginiz karakteri giriniz: ");
        char character = input.next().charAt(0);

        for (int i = 1; i < row + 1; i++) {

            for (int j = 1; j < column + 1; j++) {
                System.out.print(" " + character + " ");

            }
            System.out.println();

        }
    }
}
