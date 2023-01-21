package day03Scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur
        //Class ismi     Object ismi     atama Operatoru     "new" keyword     Constructor
               Car          myCar              =                 new              Car();
        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);

        myCar.hareket();
        myCar.dur();

        Student TomHanks =new Student();
        System.out.println(TomHanks.name);
        System.out.println(TomHanks.grade);
        System.out.println(TomHanks.address);

     TomHanks.study();
     TomHanks.feed();



    }
}
