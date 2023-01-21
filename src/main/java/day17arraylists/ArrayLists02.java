package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

         //ArrayList olustururken sag tarafa (constructor) ArrayList yazmak zorundasiniz.
         // amam sol tarafa ister "ArrayList" yazin isterseniz de "List" yazin, ikisi de calisir.
        /*
   ArrayList Sol tarafadaki ArrayList Yazma zorunlulugu yok. List te yazilabilir.
            List<Character> initials = new ArrayList<>();
            List yazinca Adem'in Oglu demis oluruz
            Array list yazinca Mustafa'nin oglu deriz.
            Hangisi daha dogru?
           ==> Ihtiyaca gore bu tanimlama degisir. Ama ikisi de kullanilir.
           Sag taraftaki Arraylist zorunludur cunku Constructor'tir. ArrayList<>()
           Constructor olmadan yeni bir obje olusturulamaz.

 */

    List<Character> initials=new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');


       int numOfElement= initials.size();//BIR LIST TE KAC ELEMAN OLDUGUNU NASIL ANLARIZ SORUNA CEVAP..

        System.out.println(numOfElement);//4


        //NOte: arraylerin lengti listlerin size demek.
        //yani;//Note: Array'lerden bahsederken "length" kullanin, List'lerden bahsederken "size" kullanın

        //Bir Lis'ten istenen bir eleman nasil alinir?

        char u = initials.get(2);
        System.out.println(u);//M

        //Example 1:Verilen bir String List'teki tum elemanlarin toplam character sayisini bulan code yaziniz.

        List<String>cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol :

       int sum=0;

        for (String w:cities){

          sum=sum+w.length();
        }


        System.out.println(sum);

        //2.yol:

        int toplam =0;

        for (int i=0;i<cities.size();i++){

      toplam   =   toplam+ cities.get(i).length();
        }
        System.out.println(toplam);

        // Bir List'teki istenen bir elemani nasil degistirebiliriz?
       // set()--> yazılan indexdeki elemanı istenenle degiştirir

        cities.set(0,"New York");

        System.out.println(cities);


        //Example 2:Maas List'i olusturunuz ve maaslara % 20 zam yapiniz.

        List<Double>salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        //1.yol:
        int idx=0;
        for (Double w:salary){

            salary.set(idx,w * 1.20);

            idx++;

        }
        System.out.println(salary);

        //2.yol:

        for (int i=0;i<salary.size();i++){

      salary.set (i,salary.get(i)*1.20);



        }
        System.out.println(salary);
    }
}
