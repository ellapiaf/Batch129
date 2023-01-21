package day02datatypesmethodcreation;

import javax.xml.transform.stream.StreamSource;

public class MethodCreation01 {

    /*
    Java' da method nasil olusturulur?
    1) main method'un disinda olusturulur
    2)Access Modifier + Return Type + Method Ismi+ () + {} // 5 adimda method olusturulur
     */
    public static void main(String[] args) {
   //  int sonuc=    add(80,5,7);

     //System.out.println(sonuc);

    long carpmasonucu = multiply(3,6);

        System.out.println(carpmasonucu);

        double cube =Kup(8);
        System.out.println(cube);
    }



    public static double Kup (double a) {
        return a*a*a;

    }

    protected static  long multiply(int a, int b) {


        return a * b;
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu toplayan method'u olusturunuz ve kullaniniz.


}
