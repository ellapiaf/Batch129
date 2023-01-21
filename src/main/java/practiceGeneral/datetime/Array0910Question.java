package practiceGeneral.datetime;

import java.util.Arrays;

public class Array0910Question {
    public static void main(String[] args) {

//9.soru  12'nin arr Array' inin elemanı olup olmadığını kontrol etmek için hangi kod yazilmalidir?
        int arr[] = {1, 23, 12, 2, 3};


        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 12));




        //Example 10: System.out.println(Arrays.binarySearch(arr, 12));  //       Ekran ciktisi nedir?


//        int arr[] = {12, 23, 13, 2, 3};

       //answer :

//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 12));//2


    }
}