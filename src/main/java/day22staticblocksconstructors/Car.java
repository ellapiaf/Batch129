package day22staticblocksconstructors;

public class Car {

    /*

    Constructor nedir?
    Class'dan object  uretmemize yarayan code vloack'laridir.

    Class olusturdugumuzda Java bize otomatik olarak bir Constractor verir.
    Ama bu constractor gozle gorulmez, gozle gorulmeyen otomatik olarak Java tarafindan verilen bu Constractor'lara
    "default constractor" denir.

    "default constractor" lar "Car(){}" seklindedir.


   Siz kendi Constractor'inizi olusturdugunuz da Java
   default Constractir'i siler.


   Bir Class'da farkli parametreler kullanarak istediginiz kadar Constructor olusturabilirsiniz.

   Farkli constractor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.


Interview Sorusu: Method ile Consturctor'in farki var midir ? Varsa nedir?

Cevap :           Method ile Constractor farkli yapilardir.

                i)Mthod'larda "Return type" vardir ama "constractor"larda "return type"yoktur.
                ii)Method"larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                   Constractor'larin ismi ise her zaman Class ismi ile ayni olmalidir.


     */

    String make="Honda";
    String model="Accord";

    int year =2023;

    boolean hybrid=true;

    Car(String make,String model,int year,boolean hybrid){
      this.make=make; ////this.make bu class daki make i benim yaptigim make yap demek
      this.model=model;
      this.year=year;
      this.hybrid=hybrid;
    }

   public Car(String make,String model){
        this.make=make;
        this.model=model;

        if(year==2023){
            this.year=0;

        }
        if(hybrid==true){
            this.hybrid=false;
        }
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

}
