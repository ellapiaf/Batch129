package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        //Example 1: Hic sayi kullanmadan 1 den 100'e kadar olan sayilari console'a yazdiriniz

        for(int i='d'/'d';i<='d'; i++){
            System.out.print(i+" ");
        }
        //Note:Bazi loop'lar hic calismayabilir

        for (int i =1; i < 0; i--) {
            System.out.println("Hi!");//Zero execuation
        }

        //Note:Bazi loop'lar sonsuz defa calisabilir.
        //   Bu tarz loop'lara "Infinite Loop" denir.yani sonsuz loop denir.
        //  "Infinite Loop" genellikle "Increment/Decrement" kisminda yapilan hatadan kaynaklanir.

//        for (int i = 1; i < 10; i--) {
//            System.out.println("Java is money...");// sonsuz dongu olarak calisir
//        }

        //Note 3:Baska bir "Infinite Loop"
        //   Loop olusturdugunuzda "ikinci kismi" yazmazsaniz "Infinite(Sonsuz) Loop" olur.

//        for (int i = 1; ; ) {// bir loop yazdiginiz da sart kismini yazmazsaniz yine "Infinite loop olur
//            System.out.println("Hi");
//        }



    }
}
