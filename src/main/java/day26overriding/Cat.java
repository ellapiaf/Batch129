package day26overriding;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override// @ ile baslayan override Annotation'i denir.Ne ise yarar method tepesine koyarsaniz Java override kurallarini kontrol eder.
    // Eger kurallar ihlal edilmis ise hata verir.
    //Override  annotation :Override kurallarinin Jva tarafindan kontrol edilmesini saglar.
    public void eat() {//Child'daki override edilmis eat() method'una "Overriding Method" denir.
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats Drink...");
    }

    @Override
    public Animal create() {
        return new Cat();// new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin olusturdugumuz Cat'i Animal data type'ina koyabiliriz.
    }
}
