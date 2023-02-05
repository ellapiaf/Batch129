package day36lambda;

public class Utils {

    //Utils = Kullanilacak Seyler Demek = Bu classin icine tekrar tekrar lazim olacak methodlari koyariz

    public static int getLengthSquare(String s){

        return s.length()*s.length();
    }

    public static boolean isEven(String s){
      return  s.length()%2==0;
    }

    //note:UtilsClass tekrar tekrar kullanilacak methodlarda kullanilir tek sefer kullanilacak methodlarda kullanmamiza gerek yoktur.

    public static String getLastChar(String s){

     return   s.substring(s.length()-1);
    }

    public static void printInTheSameLineWithASpace(Object obj){
        System.out.println(obj+" ");
    }
}
