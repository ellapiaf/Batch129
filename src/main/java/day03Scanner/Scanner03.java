package day03Scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adressini aliniz ve ekrana yazdiriniz

        Scanner input=new Scanner(System.in);
        System.out.println(" lutfen adress giriniz...");
        //nextLine() method'u kullanicidan cok kelimeli String almak icin kullanilir.
        String address =   input.nextLine();

        System.out.println(address);

    }
}
