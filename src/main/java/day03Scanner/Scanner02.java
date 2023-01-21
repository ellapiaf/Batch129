package day03Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //kullanicadan ilk ismini ve soy isimini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz ...");
        //next() method kullanicidan tek kelimeli String almak icin kullanilir.

        String firstName = input.next();
        System.out.println("Lutfen soy isminizi giriniz ...");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName  );
    }
}
