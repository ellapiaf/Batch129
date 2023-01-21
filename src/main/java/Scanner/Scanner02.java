package Scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;


        Scanner input=new Scanner(System.in);
        System.out.println("uzunluk giriniz");
        int Length=input.nextInt();

        System.out.println("genisligi giriniz");
        int width=input.nextInt();

        System.out.println("uzunlugu giriniz");
        int height=input.nextInt();


        System.out.println("diktorgen Hacmi  : " +Length*width*height);

        System.out.println("dikdortgen Hacmi : " + diktorgenHacmi(Length, height,width));
    }

    public static int diktorgenHacmi(int Length , int width,int height){

        return Length*width*height;
    }
}
