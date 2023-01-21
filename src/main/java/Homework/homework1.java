package Homework;

public class homework1 {

    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
   //4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz
    public static void main(String[] args) {
        int RecArea = rectangleArea(4,3);
        System.out.println(RecArea);

        double RecPerimeter=rectanglePerimeter(4,3);
        System.out.println(RecPerimeter);

double circlePrimeter=circleCircumference(4);
        System.out.println(circlePrimeter);

double circleCircum=circleCircumference(4);
        System.out.println(circleCircum);
    }
    public static int rectangleArea(int a, int b){

        return a * b;
    }
    public static double rectanglePerimeter(double a,double b){
        return 2*(a+b);
    }
public static double circleCircumference (int y){
    return 2*y*Math.PI;
}
    public static double circle(int y){
        return Math.PI*y*y;
    }

}
