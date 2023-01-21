package day20passbyvalueoverloading;

public class PassByValue01 {



        /*

        Pass By Value:Method'a Value'nun bir kopyasini gonder demektir.

        Bu nedenle Pass by Value 'da orjinal parametre degismez.

        Java Pass  By Value kullanilir,


        1)Java  variable'nin orjinal degerini korumak ister

        2)Java Variable'nin icindeki degeri kopyalar ve methodun icerisine kopya degeri gonderir.

        Deger uzerinde yapilan degisiklikler orjinal parametreyi etkilemez.

        Pass By Referance 'da ise referans kopyalanir ve method da kullanilior.

        Yapilan degisiklik orjinal parametreyi etkiler.

        Bu tarz programlar degeri korumak istiyorsa isi developera birakmistir.

        Kendisi degeri degistirir.

         */

    public static void main(String[] args) {
        int gomlek=100;

        System.out.println("gomlek = " + gomlek);//100

        // ogrenciIndirimi(gomlek);
        // System.out.println("gomlek = " + gomlek);//gomlek = 100
        gomlek= ogrenciIndirimi(gomlek);
        System.out.println("atamadan sonra maindeki gomlek = " + gomlek);

    }//main

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//ogrenciGomlegi = 90
        return  ogrenciGomlegi;
    }//ogrenciInd Meth
}
