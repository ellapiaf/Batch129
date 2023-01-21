package day28exceptions;

public class Exception05 {

    public static void main(String[] args) {

        int a = 16;
        int b = 2;
        String s = "My Java";
        getCharFromString(s,a,b);

    }
    //try kisminda birden fazla Exception olsuturma ihtimali olan kod varsa , coklu "catch" kullanabilirsiniz.
    //Coklu "catch" kullandiginiz da Exception Class'lar arasinda "parent-child" iliskisi yoksa catch'lerin sirasi
    // onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.
    //Coklu "catch" kullandiginiz da Exception Class'lar arasinda "parent-child" iliskisi varsa, catch'lerin sirasi
    // onemlidir. Child olan class ustte olmalidir yoksa hata verir.

    // Exception Class'lar arasinda "parent-child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
    //icin ozellestirilmis code'lar yazarsiniz(hirsiz icin 155,hasta icin 112 gibi )
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
        public static void getCharFromString(String s, int a, int b) {
            try {
                int idx = a / b;// bu kisimda aricmeticException ihtimali var.
                char ch = s.charAt(idx);// bu kisimda StringIndexOutOfBoundsException ihtimali var.

                System.out.println(ch);
            } catch (ArithmeticException e) {
                System.out.println("Do not divide by zero ");
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Olmayan index kullandiniz");
            }

        }
}
