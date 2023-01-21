package day28exceptions;

public class Exceptions01 {



        /*
        1)Exception demek beklenmedik problem demektir.Seyahatte benzin'in bitmesi , arabanin bozulmasi gibi..
        2) Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir.Mesela benzin bitince Yol yardimi arariz.
           Aplication'lar da da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme "Exception Handling" denir.
        3)Exception'lar temel olarak ikiye ayrilirlar :

         i)Compile Time Exception:Siz code yazarken farkedilir ve yazdiginiz code'un alti kirmizi cizgi ile cizilir.
          ii)Run Time Exception:Siz code yazarken farkadilmez ama, code'u calistirdginiz da console'da hata alirsiniz.
          4)Exception'lar disinda "Error" diye adlandirgimiz "Handle" edilemeyen durumlar vardir mesela:
            Gercek hayatta soforun olmesi gibi , handle edilemeyecek durumlar "Eror" dur.
            Application'larda "Memory"nin dolmasi "Error" dur.
            Iki tur memory vardir;
    i)Stack Memory: dolarsa "StackMemoryFlow Error" alirsiniz.
    ii)Heap Memory: dolarsa "OutOfMemory Error" alirsiniz.
    6)   Why we use try-catch instead of useing if-else ?
      if else kullanirsak olusabiilecek  her problemi spesifik olarak if parantezinin icine yazmamiz gerekir
      Bu da ciddi bir matematikl bilgisi gerektirir,ve yazacagimiz kodu cok uzatir.
     ma try catch'te java , ilgili Exception ile alakali  olusabilecek butun problemleri yakalar

         */

    //Note Interwiew sorusu: Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);
    }
    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini asagida yazdik.
        public static void divide(int a,int b) {
            System.out.println(a / b);
            try {
                System.out.println(a / b);

                System.out.println("I am here ");
            } catch (ArithmeticException e) {
                System.out.println("Do not divide by zero");
            }

            System.out.println("You are here ");
        }
    //"Exception  Handlin" de if-else kullanilmaz.Bakiniz 6.Note
        public void divide2(int a, int b){

        if (b==0){
            System.out.println("Do not divide by zero");
        }else{
            System.out.println(a/b);
        }




        }
}
