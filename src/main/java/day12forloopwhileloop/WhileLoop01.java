package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {


        //Example 1: 3 'den 6'a kadar tamsayilari console'a yazdiriniz.

        //1.yol:

        for (int i = 3; i < 7; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        //2.yol: While-loop
        int i = 3;

        while (i < 7) {

            System.out.println(i + " ");

            i++;
        }

        //Example 2: 23'den 12 'ye kadar cift tamsayilari concole'a yazdiriniz.
        int k = 23;

        while (k > 11) {
            if (k % 2 == 0) {
                System.out.println(k + " ");


            }
            k--;
        }
        System.out.println();
        //Example 3:verilen bir tamsayinin rakamlarini toplamini concole yazdiran kodu ayziniz.

      //Note : sayi %10 her zaman sayinin son rakamini verir.


//1.yol : While-loop
      int num=578;
      int sum=0;
       while(num>0){

         sum= sum+ num%10;
           num/=10;

}
        System.out.println(sum);


       //2.yol:for-Loop

    int a=684;
    int toplam=0;

        for (int j = a; j >0 ; j/=10) {
       toplam=  toplam  +    j%10;
        }
        System.out.println(toplam);//18
    }
}
