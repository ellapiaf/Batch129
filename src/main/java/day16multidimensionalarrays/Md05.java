package day16multidimensionalarrays;

import java.util.Arrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1: Bir  integer multi-dimensional array olusturunuz.
        //  Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yazdiriniz.

        int a[][] = {{2, 5}, {4, 7, 11}};

        int multi = 1;

        for (int[] w : a) {

            for(int k:w ){

                multi=multi*k;
            }

        }
        System.out.println(multi);//3080
    }
}