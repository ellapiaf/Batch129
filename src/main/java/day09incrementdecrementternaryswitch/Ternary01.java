package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

//Example 1:
        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;
        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

//Example 2:Verilen bir sayinin  mutlak degerini hesaplayan kodu yaziniz.
// -4==> -1*-4      4==>4               0==>0
        int c = -4;
        int r2 = c < 0 ? -1 * c : c;

        System.out.println(r2);

//Example 3 :Iki sayinin isareti ayni ise bu sayilari carpan , isaretleri farkli ise "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz.


        int m = 5;
        int n = 6;

        //"Object" java da butun Non- primitive data type larinin ortak parentidir.(babasidir en  tepesidir.
        //"Object" in parenti yoktur,
        // farkli data typleri icin ortak bir variable olusturmak istediginizde data type olarak object kullanabiliriz.
        // Java 'da " "ObJECT" , INSANLIK ALEMIN DE "hZ.ADEM" e benzer.
        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "farkli isaretli sayilari carpamiyorum";

        System.out.println(r3);

//Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden code yaziniz.
        int h = 555;
        h = Math.abs(h);
        String r4 = (h > 99 && h < 1000) ? h + "3 basamakli sayidir" : h + "3 basamakli sayi degildir.";
        System.out.println(r4);

        
    }
}
