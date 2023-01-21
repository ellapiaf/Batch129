package day05typecastingstringmanipulations;

import java.sql.SQLOutput;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s= " Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.

      boolean isEnd =   s.endsWith("money");

        System.out.println(isEnd);
        //Example 2: "s" String'deki  "money" kelimesini " dollar" kelimesine ceviriniz.

      String newS1=  s.replace("money","dollar");

        System.out.println(newS1);

        // Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money


        //Example 4:  "s" String'indeki "a" harflerini "*" a çeviriniz.
        //Note: replace () method'unda coklu character ile calisirsaniz mecbur cift tirnak kullancaksiniz.
        // ama tek chracter ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        //Note : ama ya ikiside cift tirnak olmalidir ya da ikiside tek tirnak olmalidir.
        String s3=  s.replace("a","*");

        System.out.println(s3);

        //Example 5: "s" String'indeki "n" harflerini "XXX" a çeviriniz.

       String s4=  s.replace("n","XXX");

        System.out.println(s4);

        //Example 6: "s" String`indeki tum "e" harflerini siliniz.
        //Note :"Hicbir sey" char data type'inda yok bu yuznden replace() method'u kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.
        String s5=  s.replace("e","");

        System.out.println(s5);

         //Example 7:"t" Strindeki tum rakamlari "* ceviriniz
         //Note: bir grup data'yi degistirmek ikcin replaceAll() kullanilir.

        String t= "Ali 13 yasindadir!...";

     String t1   =t.replaceAll("[0-9]]","*");

        System.out.println(t1);

        /*
        Meshur Regex'ler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==>[a-z]
        3) Tum buyuk harfler ==>[A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==>[a-zA-Z]
        5) Tum harfler ve rakamlar ==>[a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==>[aeiouAEIOU]
            example:    x,q,w harfleri ==>[xqw]


         8)Kucuk harflerden farkli tum character'ler ==>[^ a-z]
         9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

         */

    //Example 8: "t" Strinde ki tum rakamlari ve harfleri umleme ceviriniz.


        String t2   =t.replaceAll("[a-zA-Z0-9]","!");

        System.out.println(t2);



       //Example 9: "t" String'indeki tüm sesli harfleri "?" e çeviriniz

        String t3   =t.replaceAll("[AEIOUaeiou]","?");

        System.out.println(t3);

        //Example 10: "t" Strinde ki  kucuk harfler disindaki tum characterleri "<>" ceviriniz.


        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);


     //Example 11: "t" String'deki tum harfler disindaki tum characterleri "+" ceviriniz.
         String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

//Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz
        String t6=t.replaceAll("[^ ]","+");
        System.out.println(t6);

        //Example 13:  "t" String'indeki sesli harfler'ler disindaki tum character'leri "&" ceviriniz

        String t7=t.replaceAll("[^AEIOUaeiou]","&");
        System.out.println(t7);

    }
}
