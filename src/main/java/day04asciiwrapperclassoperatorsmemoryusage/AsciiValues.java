package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    public static void main(String[] args) {

        // Java da her karakterin sayisal bir degeri vardir.
        // Bu degerler ASCII deger'ler olarak adlandirilir.
        // Bu degerlerin tamaminin bulundugu tabloya ASCII TABLE

        int  ch='A';
        System.out.println(ch);
        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        //Java'da char'ları matematiksel işlemlerde kullanırsanız, Java o char'ların ASCII değerlerini kullanır.
        System.out.println(c1 + c2);//138

    }
}
