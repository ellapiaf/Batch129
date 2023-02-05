package lambdarecap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifLamExYazdir2(sayi);
        System.out.println(" \n  *******");
        kareYazdir(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyKucSirala(sayi);
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******");
        toplamMetRef(sayi);
        System.out.println(" \n  *******");
        toplamLambdaEx(sayi);
        System.out.println(" \n  *******");




    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t%2==0 && t>0).
                forEach(t-> System.out.print(t+" "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın


    public static void ciftVePozitifLamExYazdir2(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);

    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi) {

        sayi. stream().map(t -> t * t). forEach(Utils::yazdir);




    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);

    }
     //Lambda expression'dan kurtulmanin bir yolu da
    //kendi methodumuzu Util class'da olusturup cagirarak kullanmaktir.
   //UtilsClass tekrar tekrar kullanilacak methodlarda kullanilir tek sefer kullanilacak methodlarda kullanmamiza gerek yoktur.
   //Bir method'u Utils'e koydugumuzda su soru aklımıza gelmesi lazim "Bu method cogunlula kullanacak mi?

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

public static void buyKucSirala(List<Integer>sayi){

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
}

// SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız



        public static void pozitifKupBirlerBas5(List<Integer> sayi){
            sayi.
                    stream().
                    filter(t->t>0).
                    map(Utils::kupAl).
                    filter(t->t%10==5).
                    forEach(Utils::yazdir);
        }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın.

    //Note : optinal'a assign neden eder:null olma ihtimali var diye risk almak istemiyor.
    //reduce methodu terminal methoddur.Terminal methodlardan sonra foreach gibi methodlar kullanilamaz.
    //Bir methoddan sonra hicbir islem yapilamiyorsa buna terminal method denir.

    public static void toplamMetRef(List<Integer> sayi) {

        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);

        //reduce() method'u terminal methottur.Terminal methodlardan sonra hicbir method kullanılamaz.

        System.out.println(sonuc);

    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaEx(List<Integer> sayi) {

        int sonuc = sayi.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sonuc);


    }
    //Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
/// "u"  ise degerlerini her zaman "stream " den yani akista bize ne verilmis ise (orn List) oradan alir .
    //reduce( 0,(t,u)->t+u) burada bu codu int bir konteyner a koydugumuzda kizarmaz
    //cunku herhalukarda  "0" bir deger oldugu icin "Optional Integer" a da gerek kalmaz.
    //Aksi takdirde "0 Identity"  olmadiginda Java, Ya listte hic eleman yoksa(null ise)!!!  diye kizarir.
    //Java null i Integer kabul etmedigi icin hata verir , bunu engellemek icin java "Optional IInteger" a cevirir

//SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın




    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftkaresirala(List<Integer> sayi) {

        return sayi.stream().filter(t -> t % 2 == 0).map(t -> t * t).sorted().collect(Collectors.toList());
    }
}
