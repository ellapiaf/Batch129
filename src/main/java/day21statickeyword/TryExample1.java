package day21statickeyword;



public class TryExample1 {
    static int a=10;
    public static void main(String[] args) {

        TryExample t1=new TryExample();
        TryExample t2=new TryExample();

     t1.a=a+2;
     t2.a=a+3;

        System.out.println(t1.a);
        System.out.println(t2.a);

        // what is the output?
    }
}
