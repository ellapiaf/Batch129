package ssgmentoring.ifstatementsternary3;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi  giriniz");
        String day= scan.nextLine().toLowerCase();

        if (day.equals("pazar") ||day.equals("cumartesi")){
            System.out.println("haftasonu");
        }else{
            System.out.println("Haftaici");// istersen hafta icini else de kullanabilirsin hem de asagidaki if lerde de yapabilirsin
        }

        if (day.equals("pazartesi")||day.equals("sali")|| day.equals("carsamba")|| day.equals("persembe")){
            System.out.println("Haftaici");
        }
    }
}
