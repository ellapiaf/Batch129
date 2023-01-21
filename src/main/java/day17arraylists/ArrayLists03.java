package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        List<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        System.out.println(cities);

        //remove() methodu index ile kullanilirsa 0 index'teki elemani siler.
        //remove() meyhodu index ile kullanilirsa size sildigi elemani verir.
      String n=  cities.remove(1);
        System.out.println(n);//istanbul
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true veya false verir.
        //eger elemann list'te var ise o eleman siler ve size true der.
        //eger eleman listte yok ise o eleman silemediginden size false der.

   boolean p=     cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);
    }
}
