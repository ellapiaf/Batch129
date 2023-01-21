package memorykullanimiasciitable;

public class AsciiValue02 {

    //soru=2:  kucuk a dan kucuk z kadar ascci degerli toplyan bir program yziniz

    public static void main(String[] args) {
         int toplam=0;
        for (int i = 'a'; i <='z'; i++) {
            System.out.println(i);

            toplam=toplam+i;
        }
        System.out.println("A dan z kadar Toplami :" +toplam);//2847



    }
}
