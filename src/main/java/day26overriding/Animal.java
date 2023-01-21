package day26overriding;

public class Animal {

     // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
     // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
     // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
     // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

    /*
    1)Parent Class'daki method'u Child Class icinde ozellestirerek kullanmaya "Overriding " yapmak denir.
    2)Overriding 'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
    3)Override ==> Override annotation :Override kurallarinin Java tarafindan kontrol edilmesini saglar.
    4)Overriding 'de parent Class'daki method'a "Overridden Method", child class'daki method'a ise "Overriding Method" denir.
    5)"Private" Method'lar "Override" edilemezler.
    6)Child Class'daki override edilmis method(Overriding Method)'un
      access modifier'i Parant Class'daki override edilmis method(Overridden Method)'un
      access modifier'indan dar olamaz.

      Overridden Method ==>protected ise Overriding Method ==> protected+public
      Overridden Method ==>default  ise Overriding Method ==> default + protected+ public
      Overridden Method ==>private  ise Overriding Method ==> override olmaz ki ** access modifier'i olsun. Look 5th.

      7)Child Class'daki override edilen Method'un (Overriding Method) return type'i method'un return ettigi data type'inin aynisi veya o data type'nin parent'i oalrak secilebilir.
      8)Method'un retuirn type'i "primitive " ise , Overriding yaparken return type degistirelemz.cunku ; return type ya ayni olur veya parent'dan secilir ama
       primitive'ler arasinda "parent-child ilsikisi " olmadigindan secmek  mevzu olamaz. O zaman tek secenek aynisi olmalidir kalir.
      9)Method'un retuirn type'i "Wrapper Class" ise , Overriding yaparken return type degistirelemez. cunku; return type ya ayni olur veya parent'dan secilir.
        ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur, geriye sadece aynisi olma ihtimali kalir.
      10)Method'un return type'i "void" ise ,Overriding yaparken return type   degistirilemez.
     */

    public void eat(){//Parent'daki  override edilmis eat() method'una "Overriding Method" denir.
        System.out.println("Animals eat....");
    }public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){

        return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }

}
