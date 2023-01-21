package memorykullanimiasciitable;

import java.sql.SQLOutput;

public class AsciiValue01 {

    public static void main(String[] args) {

        char ch='A';
        System.out.println(ch);

        //1.yol
        System.out.println(ch+0);//bu sekilde yazarsak ascii degerini yazar yani 65 yazdirir.

        //2.yol
        int ch1='A';
        System.out.println(ch1);// Bu sekilde de yazdigimiz da bize yine ascii degerini verecektir.

        int soruIsareti='?';
        System.out.println(soruIsareti);//63 verir ascii degerini verir bize



        //soru=1:  Buyuk A dan Buyuk Z kadar Tum ascci degerli  bir program yaziniz.

        for (int i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");


            }
        System.out.println();

        for (int i = 'a'; i <='z'; i++) {
            System.out.print(i+" ");

        }
//soru 2:
        //A:65
        //B:66

        for (int i ='A'; i <'Z'; i++) { // A:65
            System.out.println("ASCII Value :  "+(char)i+" "+ i+" ");

        }
        System.out.println();


        }
        }


