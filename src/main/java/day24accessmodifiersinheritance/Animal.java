package day24accessmodifiersinheritance;

public class Animal {
   /*
   Inheritance'in faydalari;
1) Code standardında tekrar iyi değildir.
2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
3) Gelişime update'e açık olmalıdır
4) Code atomic yapıda olmalı.
Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
NoTE 3:  "public " method'lar child class'lar tarafindan kullanilabilir.
"chid class'lar tarafindan kullanilabilir" demek " inherit edilebilir" demektir.
Note 4: "protected" method'lar "inherit edilebilir"
Note 5: "default" method'lar object ile ayni package 'de olduklari surece "inherit edilebilir".
        ama default method ile object'in uretildigi class farkli package'lerde ise "inherit edilemezler".
 note"private"methiod'lar "inherit edilemezler"
        Note 7: Java birden fazla  parant'i onaylamaz.yani Java birden fazla parent'i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
        Note 8: Child--> Parent-->Grand Parent---> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
        Note 9:Java' da "Object Class" tum Java Class'larinin ortak parent'idir
        Note 10: Java' da Object Class haric tum class'larin parent'i vardir..Java da paranti olmayan tek class "Object Class"dir.
        Note 11:Java 'da "parent" dan "child" a olan iliskilere "HAS-A Relationship" denir.
                Java' da  "child" dan " parent" a olan ilskilere "Is-a Relationship" denir.
        Note 12:Java  da her class'in bir tane deafault constractor'i vardir.
                Bu default constractor class'in icinde gorunmez cunku default constructor "Object Class" icindedir.
                Bizim class'imiz default constractor'a ihtiyac duydugunda parent olan object class'a gider ve oradaki constractor'i kullanir.
    */

    public void eat(){
        System.out.println("Animals eat...");
    }
    void drink(){
        System.out.println("Animals drink...");
    }

}
