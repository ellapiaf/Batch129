package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        // MultiDimensional Array nasil olusturulur?
         int a[][]=new int[3][2];

         //MultiDimensional Array'ler  nasil yazdirilir?

        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]// rakam vermedigimiz icin defult degerler verdi unutma

        //MultiDimensional Array'ler  eleman nasil eklenir ?

        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        System.out.println(Arrays.deepToString(a));

         //Note: Array'lere non-primitive data konulamaz
         // Array'lere primkitve data veya reference konulur.
        // ama siz bir array'i yazdirmak istedginizx de Java adress ler yardimi ile - non-primitive data'ya ulasir.
        // ve o  non-primitive data'yi arrayin icindeymis gibi gosterir.


        //MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        System.out.println(a[1][0]);// 81

        System.out.println(Arrays.toString(a[0]));// [5, 12]
        System.out.println(a[2][1]);// 0
    }
}
