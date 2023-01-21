package day05typecastingstringmanipulations;

public class StringManipulations01 {

    // String bir non-primitive data type'dir ve ayni zaman da bir class'dir.


    public static void main(String[] args) {


      String s="Java is easy";

      // Example 1 : "s" Stringdeki tum character'leri buyuk harf yapiniz.

        String sUpper =s.toUpperCase();

        System.out.println(sUpper);

      // Example 2: "s"   Stringdeki tum character'leri kucuk  harf yapiniz.

      String sLower =  s.toLowerCase();

        System.out.println(sLower);
     //Example 3 :"s" String'indeki ilk character'i  aliniz.

    char firstChar= s.charAt(0);
        System.out.println(firstChar);

     // Example 4:"s" String'deki ikinci ve sondan ikinci

       //1.Yol: Ayni satirda yazdirmak icin
//        char secondChar = s.charAt(1);//a
//        char secondLastChar = s.charAt(10);
//        System.out.print(secondChar);
//        System.out.println(secondLastChar);

        //2.Yol: Ayni satirda yazdirmak icin

//     char secondChar=s.charAt(1);
//     char secondlastChar=s.charAt(10);
//        System.out.println(" "+ secondChar+secondlastChar);

        // example 5:







        //Example 6 : "s" Stringdeki ilk 4 characteri aliniz.

     String sub1  =s.substring(0,4);
        System.out.println(sub1);

        String sub2  =s.substring(5,7);
        System.out.println(sub2);

        String sub3  =s.substring(8,12);
        System.out.println(sub3);

        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 7: "s" String'indeki "is" kelimesini alınız
        String sub22 = s.substring(5,7);
        System.out.println(sub22);

        //Example 8: "s" String'indeki "easy" kelimesini alınız
        String sub33 = s.substring(8,12);
        System.out.println(sub33);
        //Bir karakterden başlayıp String'in sonuna kadar almak isterseniz, ikinci index'i yazmayınız
        //s.substring(8,12); yeribe s.substring(8); yazınız
        String sub43 =  s.substring(8);
        System.out.println(sub43);

        //example 9: "s" Strinde "money" kelimesinin var olup olmadigini kontrol ediniz.

     boolean isExist=s.contains(" ");
        System.out.println(isExist);

        /*
        Bir methodu ogrenirken 3 seyi mutlaka ogrenin :
        1) Bu method ne is yapar?
        2)Bu method' un farkli kullanimlari nasildir?
        3)Bu method size ne return eder ?

         */

        //Example 10: "s String'inin belli bir harf ile baslayip baslamadigini kontrol ediniz.

        boolean isStart=s.startsWith("Java");

        System.out.println(isStart);

        //Example 11:"s String'inin 6. characterden itibaren belli bir harf baslayip baslamadigini kontrol ediniz.


        boolean isBegin=s.startsWith("i",5);

        System.out.println(isBegin);

    }
}
