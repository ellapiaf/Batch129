package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);//5

        //Increment
        a = a + 2;// veya a+=2; seklinde de yazilabilir.
        System.out.println(a);//7

        //Example 1:Bir tane integer variable olusturun ve onu iki sekilde 5 atririn.

        int b = 10;
        System.out.println(b);
        b = b + 5;
        System.out.println(b);
        b += 5;
        System.out.println(b);

         //Decrement 1:
        int c = 8;
        System.out.println(c);//8
         c= c-3;
        System.out.println(c);//5

         c-=3;
        System.out.println(c);//2

        //Increment 2 :
     int j =6;
        System.out.println(j); //6
      j=j*2;
        System.out.println(j);//12

        int d = 20;
        System.out.println(d);//
        d= d-3;
        System.out.println(d);//

        d-=3;
        System.out.println(d);//
        // decrement 2:
        int f=24;
        System.out.println(f);//24
        f=f/2;
        System.out.println(f);//12
        f/=2;
        System.out.println(f);//6

        //Increment 2:

//        int e=6;
//        System.out.println(e);//6
//        e=e*2;
//        System.out.println(e);//12
//
//        e*=2;
//        System.out.println(e);


        //"1" Increment :

        int g=12;

        g=g+1;

        g+=1;
        f++;// 1 ile artirmalar da genel de bu son yontem kullanilir ve 1 artirir.

      //"1" ile decrement :

        int h=10;
        h=h-1;
        h-=1;
        h--;
        //"post" Increment ve "pre" increment // pre => once demek  , post => sonra demek

        int i=10;
        int k=i++;// post Increment

        System.out.println(k);//10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i);//11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur.



       int m=15;
       int n=++m;// pre-increment cunku increment, variablenin isminden once yazildi
        System.out.println(m);
        System.out.println(n);

        int p=17;
        int r=p--;
        System.out.println(r);
        System.out.println(p);

        int s=20;
        int t=--s;
        System.out.println(t);
        System.out.println(s);




    }
}
