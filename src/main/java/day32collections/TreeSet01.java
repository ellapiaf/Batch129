package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {


        TreeSet<Integer> ts =new TreeSet<>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        System.out.println(ts);//[3, 8, 12, 25, 32]
        long two = System.currentTimeMillis();

        HashSet<Integer> hs =new HashSet<>();

        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        System.out.println(hs);//[32, 3, 8, 25, 12]
        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
//      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        int first =ts.first();
        System.out.println(first);

        int last =ts.last();
        System.out.println(last);
        int floor1 = ts.floor(15);
        System.out.println(floor1);//12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

//floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz
        int floor2 = ts.floor(12);
        System.out.println(floor2);//12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1);//25==>15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdirildi

        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2);//25==> 25 elemanlardan biri o yuzden 25 direkt yazdirildi

        //ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz

        SortedSet<Integer>tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]==>12 elemanlardan biri o yuzden 12 ve sonraki elemanlar bir Set icinde yazdirildi

        SortedSet<Integer>tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32]==>15 elemanlardan biri degil o yuzden 15 den  sonraki elemanlar bir Set icinde yazdirildi

        NavigableSet<Integer> tailSet3 =  ts.tailSet(12, false);
        System.out.println(tailSet3);// [25, 32] ==> 12 elemanlardan biri normalde "12 ve sonraki elemanlar" bir Set icinde yazdirilirdi
        // ama ikinci parametre'de "false" kullandigim icin 12 haric tutuldu


    }
}
