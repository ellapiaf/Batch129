package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //1)while-loop
        int i=1;

        while (i<1){
            System.out.println("Sen bir while loopsun...");//1)while body hic calismadi  2)while-loop Zero Execution mumkundur.
            i++;
        }
        //2)Do-while-loop

        int k=1;

        do{
            System.out.println("Sen bir do while loops'sun..");//bu yaziyi ekranda goruruuz. sen bir do while loopssun 1)gormemiz gerekn sey su do while body calisti
            //   2)do whiile kullandiginiz loop body en az bir kere calisir. do while da "zero execution mumkun degildir.
            k++;
        }while(k<1);// bu kisim yalnis oldugu icin loop kirilacaktir.


    }
}
