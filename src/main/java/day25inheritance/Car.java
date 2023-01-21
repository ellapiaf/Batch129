package day25inheritance;

public class Car extends Vehicle  {


    public void engine(){
        System.out.println("car engine..");
    }
    public Car(){
super(3000);
        System.out.println("Car 1");
    }

    public Car(String make){
        this();

        System.out.println("Car 2: " + make);
    }

}