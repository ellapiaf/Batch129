package advanced_practice.practice06;

public class Q04_MethodOverloading_Hacim {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

    public static void main(String[] args) {

    Hacim obje=   new Hacim();
 int KupunHacmi=obje.hacimHesaplama(5);
        System.out.println("KupunHacmi = " + KupunHacmi);;


     int karePrizmaninHacmi =   obje.hacimHesaplama(5,4);

        System.out.println("karePrizmaninHacmi = " + karePrizmaninHacmi);

      int dikdortgenPrizmaninHacmi =  obje.hacimHesaplama(2,3,4);
        System.out.println("dikdortgenPrizmaninHacmi = " + dikdortgenPrizmaninHacmi);

        int kupunHacmi2 = obje.hacimHesaplama(2);
        System.out.println("kupunHacmi2 = " + kupunHacmi2);

    }


}
