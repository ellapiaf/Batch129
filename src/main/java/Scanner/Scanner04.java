package Scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

       //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int  number=input.nextInt();

      if(number%2==0){
            System.out.println("cift sayi");
      } else if(number%2!=0){
            System.out.println("tek sayi");
        }else{
            System.out.println("Lutfen cift yada tek sayi giriniz");
        }

    }
}
