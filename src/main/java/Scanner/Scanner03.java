package Scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

       // Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
        //Ali Mert Can
        //kkno:123456789

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
       String ad=input.next();
        System.out.println("lutfen ikinci ad giriniz");
        String ad2=input.next();
        System.out.println("lutfen soyadinizi giriniz");
        String soyad=input.next();
        System.out.println("lUtfen kimlik karti no giriniz");
        int ssn=input.nextInt();
        System.out.println(ad+" "+ad2+" "+soyad);
        System.out.println("Kkno :" +ssn);
    }
}
