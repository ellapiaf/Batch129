package day24accessmodifiersinheritance;

public class Vehicle {

    /*

    Note: Child Class'dan bir object olusturdugunuzda constructor'lar en ustteki
     parent class'dan baslatilarak alta dogru calistirilir.
     */

    public Vehicle(){// consructorlarin ismi class la ayni olur..
        System.out.println("Vehicle 1");

    }
}
