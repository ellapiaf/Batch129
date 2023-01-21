package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap : Yer degistirmek.1.kap : Patates.2.kap:Domates ==>Swap==> 1.kap:Domates 2.Kap: Patates

    public static void main(String[] args) {

        int a=12;
        int b=5;// Swap'den sonra ==> a=5 ve b=12

        int temp=0;

        System.out.println("a:"+ a);
        System.out.println("b:"+ b);

        // 1.adim
         temp=a; //a'daki degeri temp'e koyarak a'yi bosalttik.

         //2.Adim
         a=b; // b'deki degeri, bosalan a'ya koyduk.

         //3.Adim
         b=temp; // a'daki degeri temp'e koymustuk. Bu sefer de temp'teki a'nin ilk degerini b'ye aktardik.
// Swap (yer degistirme) islemi bu adimlar sonunda tamamlandi.

        System.out.println("a:" + a);
        System.out.println("b:" + b);

        //2.yol:
        int x=12;
        int y=5;
        System.out.println("\n*********************");//console görüntüsü için
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x=x+y; //x=17
        y=x-y; // y=12
        x=x-y; // x=5
        System.out.println("\n*********************");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
