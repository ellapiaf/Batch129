package day21statickeyword;

import org.w3c.dom.css.Counter;

public class StudentRepeat_WithMethod {



    public static String stdName="Tom Hanks";

    public int age=13;

    //----------------------------------------------

    //Ogrencinin isminin ilk harflerini veren methodu olusturunuz.

    public static String getInitials(String name) {

        String first = name.substring(0, 1);//substring kullanirsak direk string aliriz ama charat kullanirsak bize char verir ikiside olur.

        String second = name.split(" ")[1].substring(0, 1);

        return first + second;

    }
    //-------------------------------------------------------------

    //Ogrencinin isimindeki sesli harfleri (a,e,i,o,u ) sayan bir method olusturunuz

        public int countVowels(String name){

            int counter=0;

           for (int i=0;i<name.length();i++){
            char ch=   name.toLowerCase().charAt(i);//Bu bana karakteri vericek

               switch(ch) {

                   case 'a':
                   case 'e':
                   case 'i':
                   case 'o':
                   case 'u':
                       counter++;
                       break;
               }
           }


        return counter;

    }
}
