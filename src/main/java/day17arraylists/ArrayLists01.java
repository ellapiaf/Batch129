package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {



        /*
 1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
 2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
 List'ler "non-primitive" data kabul ederler ,"array" ler ise " primitive" data veya reference kabul eder.
 3) ArrayList'leri(List) oluştururken içine koyacağınız eleman sayısını başta söylemeye gerek yoktur.
     List'ler eleman sayısında "flexible" dırlar ama Array'ler "flexible" değildirler.
4) Madem "Array' ler eleman sayisina flexible degil nicin Java "Array" leri iptal etmedi?
      i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
      ii) Array'ler cok hizli calisir.
      iii) Array'ler memory'de cok az yer kaplar.

          **** Array ile ArrayList'in farki nedir? ***

1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
  soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
  cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
  Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
  Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
  Array kullanma riskini almayin



 */


    public static void main(String[] args) {


        //List nasil olusturulur?

        ArrayList<Integer>ages=new ArrayList<>();


        System.out.println(ages);//[]

        //Array'listlere  eleman nasil eklenir?////  add() her zaman elemani en sona ekler. (insertion order)
        // list eleman eklemek icin add methodunu kullaniriz.
        // add () method'u elemanlari sizin verdiginiz sirada " list" e ekler.

   ages.add(12);
   ages.add(9);
   ages.add(10);
   ages.add(888);

   ages.add(1,656);
   ages.add(3,777);
        System.out.println(ages);

        //List'e coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir.?
        //Bir List 'e coklu eleman eklemek icin o elemanlari once bir listin icine koymalisiniz.


        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);// bir list in icine index olarak ekledik

        System.out.println(ages);

        // add metodu ve indexli add methodu , coklu eklemek icin addall ogrendik !

//toArray() metodu: eleman sayisini degitirmeyecegimizden eminsek array' ye cevirip memory kullnimini azaltabiliriz
//toClear() medodu: Bir List'teki tum elemanlari siler.

        //Bir list teki tum elemanlari nasil silebilirim?

        ages.clear();
        System.out.println(ages);


   //contains() methodu: List'te elamanin var olup olmadigina bakar boolean dondurur.
     boolean r=   ages.contains(656);
        System.out.println(r);


      // Bir list'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz.?
      // iki List'in esit olabilmesi icin ayni index'de ayni elemanlar olmalidir.

//        ArrayList<String>names1=new ArrayList<>();
//        names1.add("Tom");
//        names1.add("Jim");
//        names1.add("Kim");
//
//
//        ArrayList<String>names2= new ArrayList<>();
//        names2.add("Tom");
//        names2.add("kim");
//        names2.add("Jim");

//        boolean s=names1.equals(names2);
//        System.out.println(s);//false


        //Example 1:Verilen iki integer listte tamamiyle ayni elemanlarin olup olmadigini kontrol eden code yaziniz.

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(2);
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(2);
        number2.add(3);


        Collections.sort(number1);

        Collections.sort(number2);   //Collections.sort() List'deki elemanları alıp küçükten büyüğe sıraladı

     boolean t=   number1.equals(number2);

        System.out.println(t);
    }

}