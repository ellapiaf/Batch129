package lambdarecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {


        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));
    }

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım






// SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
// karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız

    /*
java akıştan gelen elemanlar ya String değilse diye tedirgin oluyor o yüzden toString methodu ekliyoruz.
 */
    public static List<String> karakterSayisinaGoreSirala (List<String> meyve){

        return meyve.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(3).
                collect(Collectors.toList());
    }

}
