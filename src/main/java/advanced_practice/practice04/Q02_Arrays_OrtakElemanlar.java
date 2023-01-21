package advanced_practice.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q02_Arrays_OrtakElemanlar {

    public static void main(String[] args) {

        /*
     * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
     * (case sensitivity olmadan)
     * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                     String[] brr = {"sofia","brad","grace","emily","hazel"};
     * Output : [brad,sofia,emily]
     */

        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};
        List<String> list=new ArrayList<>();

        for (String w:arr){

            for (String u:brr){
                if (w.equalsIgnoreCase(u)){

                    list.add(w);
                }
            }
        }
        System.out.println("list= " +list);
    }

    public static class QO1_Arrays_OrtalamadanBuyuk {

        public static void main(String[] args) {

            //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

                     int[]arr={5,9,15,1,0,11,3};

                     int toplam =0;

                     for (int w :arr){
                         toplam+=w;

                     }
            System.out.println("toplam ="+ toplam );

                     int ortalama =toplam/arr.length;

                    System.out.println("ortalama =" +ortalama);

            System.out.print("Ortalamadan buyuk elemenler :");
                     for (int w:arr){

                         if (w>ortalama){
                             System.out.print(w+" ");
                         }
                     }
        }
    }
}
