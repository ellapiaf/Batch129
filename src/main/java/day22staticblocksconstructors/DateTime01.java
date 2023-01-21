package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {


        // Date Class
        Date myDate=new Date();

        System.out.println(myDate);//Sat Jan 07 14:27:59 CST 2023
        System.out.println(myDate.getTime());//1673123360246==> 1 ocak 1970 den su ana kadar mili saniye miktari

        // Icinde  bulundugumuz an nasil alinir?

        System.out.println( LocalDate.now());//2023-01-07

        System.out.println(LocalTime.now());//14:36:19.279212400

        System.out.println(LocalDateTime.now());//2023-01-07T14:36:19.279212400

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:27.842843300

      //Ileriki bir tarihe nasil gidilir ?

        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        // Geriki bir tarihe nasil gidilir?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //ileriki bir zaman nasil gidilir?

        System.out.println(LocalTime.now().plusHours(3));//17:58:15.072112200

        // Geriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//14:13:15.072112200

        //Zaman da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() +":" + LocalTime.now().getMinute());//15:0

        //Tarih'de   belli bir bolumu nasil aliriz?

        System.out.println(LocalDate.now().getMonth()+":" + LocalDate.now().getDayOfMonth());//JANUARY:7

        //Iki tarih nasil karsilastirilir?
        //02/13/2005 -03/01/2007  iki tane farkli dogum gunu tarihi alalim hangisi daha once gorelim :


     boolean result=LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true

        // Tarih'lerin formatlari nasil degistirilir
        //M--> Tek rakamla ay no'sunu yazar -MM--> IKI RAKAMLA AY NO'SUNU YAZAR
        //MMM-->Ay isminin ilk uc harfini yazar-MMM--> Ay isminin tamamini yazar

        //d--> Tek rakamla gun no'sunu yazar- dd--> Iki rakamla gun no'sunu yazar
        //yy--> Yilin son iki rakamnini yazar-- yyyy--> yilin tamamini yazar.


        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));//07/01/2023

    }
}
