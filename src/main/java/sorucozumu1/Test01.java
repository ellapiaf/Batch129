package sorucozumu1;

public class Test01 {

    public static void main(String[] args) {

        try {

            int a = 0;

            System.out.println("Hi");

            int b = 20 / a;

            System.out.println("How are you?");

        } catch (ArithmeticException e) {

            System.out.println("Good");

        } finally {

            System.out.println("Bad");

        }

    }



}

