package day20passbyvalueoverloading;

public class PassByValue02 {

    public static void main(String[] args) {

        String name="Tom Hanks";

    }


    public String updateName(String name, String add){

        name=name+ " "+add;

        return name;
    }
}
