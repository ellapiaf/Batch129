package day34mapsiterators;

import java.util.ArrayList;
import java.util.List;

public class Iterators01 {

   /* Iterators'lar looplarin yaptigi islemi yapar.
    Loop --> elemani alir isleme sokar eleman bitince loop break olur.
            Iterator --> elemani alir isleme sokar eleman bitince loop break olur.

    o zaman neden loop ve iterators diye ayri yapilar var ?
    Loop'lar infinite loop'a girebilir. Loop infinite olursa app p0 (priority 0 [en onemli seviye]) olur. Memory dolana kadar bekler.
    Iterators'da infinite soz konusu olmaz.
    Java Loop'lari eskiden olusturmustur. Iterator yeni bir yapidir. Her programlama dilinde de iterator yoktur.

    */

    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);


    }
}
