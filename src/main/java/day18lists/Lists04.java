package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        List<String> names=new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");


        List<String> females=new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

//names.containAll(females)"names" listinde "females" listindeki"tum elemanlarin" var olup olmadigini kontrol eder.
// Tamami varsa size"true" verir, herhangi biri yoksa size false verir.
      boolean r=  names.containsAll(females);

        System.out.println(r);
//names.subList(1,4) "names" Listindeki index'i 1,2 ve 3 olan elemanlari bir List'in icinde size verir.
// ikinci endex olan 4, dahil olmaz.
      List<String> subList= names.subList(1,4);//[Cuneyt, Mahsun, Muslum] // 1 dahil , 4 dahil değil
        System.out.println(subList);


        names.retainAll(females);

        System.out.println(names);//[Ajda]
        System.out.println(females);//[Ajda, Emel]

        //Example 1:Elektornik aletler ve ev aletleri Listleriniz var.
        //Electronik ev aletlerini listeleyiniz.

        List<String> electronics=new ArrayList<>();

        names.add("TV");
        names.add("Radio");
        names.add("Refrigerator");
        names.add("Mobile Phone");
        names.add("Notebook");

        List<String>homeGoods=new ArrayList<>();

        names.add("Carpet");
        names.add("Fork");
        names.add("Radio");
        names.add("Chair");
        names.add("TV");

        //homeGoods.retainAll (electronics) homegoods ile electronics List'lerinin ortak elemanlarinin homeGoods listi icinde verir.
        //Baka bir deyisle(In other words) homeGoods listindeki ortak olmayan elemanlari siler.
      homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]

        // names.isEmpty()==> bu method list'te hic eleman yoksa "true" verir
// bir veya daha fazla eleman varsa size "false" verir
//isEmpty()==> esasinda "names.size()==0" demektir
// ikisi ayni isi yapiyor ama java da bir sey icin ozel method varsa onu kullan
// cunku burda "names.size()==0" java yi iki kere yoruyor, hem esitligi olcuyor
// hem size'i olcuyor
//isEmpty() list'te hic eleman yoksa size "true" verir. 1veya daha fazla eleman varsa size false verir.
        //"isEmpty()" esasında "names.size()==0" demektir.
        names.isEmpty();
        System.out.println(names.hashCode());
       


    }
}
