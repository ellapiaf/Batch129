package day33maps;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
        /*

        sozluk yapisi map'a benzer
solda kelime, sagda aciklamasi vardir
soldakiler tekrarli olamaz sagda tekrar olabilir
map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
cat = evcil hayvan
dog = evcil hayvan
crocodile = timsah
tiger = kaplan
solda data sagda data
map deyince sozluk akla gelsin
sola unique lere key tekrarli olabilen sagdaki data lara value denir

map te bir data stractir dir
depolarken bu yapiya ihtiyac varsa map kullaniriz
mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir
         */
        /*
        1)Map'lerde "USA=400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
        2)"USA=400,000,000" data'sinin "USA" kismi "key" olarak adlandirilir ve "key" ler "unique" dir.
        3)"USA=400,000,000" data'sinin "USA" kismi "value" olarak adlandirilir ve "value" ler "tekrarli" olabilir.
        4)Map'ler de depoladiginiz herbir data'ya "Entry" denir, "eleman" denmez.
        5)"Entry" ler "unique" dir cunku key kisimlari unique oldugundan her bir entry digerlerinden farklidir.
        6) "HashMap" cok hizlidir cunku "HahMap" ler  "entry" leri siralamak  ile ugrasmazlar.
        7)"HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
        8)"HashMap" lerde birden fazla tane "value" u "null" yapabilirsiniz.
        9)"HashMap" ler "Multi thread" icin kullanilmaz ve "synchronization" yoktur.



         */

    public static void main(String[] args) {

        //HashMap nasil olusturulur ?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

        //HashMap 'lere nasil Entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albenia", 30000000);
        //Ayni "key" i kullanarak yeni bir "entry" eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albenia", 28000000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myannar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{USA=400000000, Albenia=30000000, Germany=85000000}

        //HashMap' lerde sadece "key" leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//[null, USA, Myannar, Bhutan, Albenia, Germany]

        //HashMap'lerde sadece "value" lari almak istiyorum.
        //Example 1: hm Map'indeki ulkelerin toplam nufusunu bulunuz?

        Collection<Integer> hmValues = hm.values();// values lar tekrarflari olabilir o yuzden set koymuyoruz


        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }

        }
        System.out.println(sum);

        //HashMap'lerde belirli bir "key" nin "value" sunu nasil alabiliriz ?
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);

//HashMap'lerde replace() methodu varoplan bir"key" nin "value" sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);// buradada key vericez value degistiricek
        System.out.println(hm);

        hm.putIfAbsent("USA", 70000000);//{null=18000000, USA=400000000, Myannar=null, Bhutan=35000000, Albenia=28000000, Germany=85000000}
        System.out.println(hm);
//Hashmap lerde putIfAbsent() methodu  entry varsa birsey yapmaz, yoksa yeni entry olusturur.
        hm.putIfAbsent("India", 70000000);//{null=18000000, USA=400000000, Myannar=null, Bhutan=35000000, Albenia=28000000, Germany=85000000, India=70000000}
        System.out.println(hm);

        //Example 2:Yeni ogretmenin maasi standart ucretten 100 tl fazla, eski ogretmenin maasi standart ucretten 2000 tl fazla olsun.

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";

        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }

        System.out.println(salaries);

        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);

        //getOrDefault() olan "key" lerin degerini verir, olmayan "key" ler icinde sizin ikinci parametreye yazdiginiz degeri verir.
        Integer r = hm.getOrDefault("Tutan", 0);
        System.out.println(r);

        //entrySet(); methodu "Map"i "Set"e cevirir.
        // Setlerin methodlarini kullanabilmek icin entrySet() kullanarak Map'i Set'e ceviririz
        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();

        System.out.println(myEntries);//[null=18000000, USA=500000000, Myannar=null, Bhutan=35000000, Albenia=28000000, Germany=85000000, India=70000000]

        //Example 3:Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console yazdiran kodu yaziniz.

        for (Map.Entry<String, Integer> w : myEntries)

            if (w.getValue()!= null && w.getKey()!=null) {

                int toplam = w.getValue() + w.getKey().length();

                System.out.println(toplam);
            }

    }}

