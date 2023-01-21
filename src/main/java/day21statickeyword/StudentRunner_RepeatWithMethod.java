package day21statickeyword;

public class StudentRunner_RepeatWithMethod {
    public static void main(String[] args) {

        //stdName static oldugundan , ona ulasmak icin object olusturmadim
        // sadece class ismini kullanmak yeterlidir.

        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.
        Student std1=new Student();
        System.out.println(std1.age);

        //------------------------------------------------------------

     //IKI TANE YAZDIGIMIZ METHOD'A ULASMAK ISTIYORUZ;
//1.METHOD RUNNER'I(Ogrencinin isminin ilk harflerini veren methodu olusturunuz).

 String initials=StudentRepeat_WithMethod.getInitials("Tom Cruise");
        System.out.println(initials);//TC

////2.METHOD RUNNER'I(Ogrencinin isimindeki sesli harfleri (a,e,i,o,u ) sayan bir method olusturunuz).
        StudentRepeat_WithMethod std2=new StudentRepeat_WithMethod();

  int vowels  = std2.countVowels("Tom Cruise");
        System.out.println(vowels);//4

  //-------------------------------------------------------------------

  // Object ile static olan method'da oulasabiliriz;!!!Fakat bu tavsiye edilmez!!!!
        //static olanlari object ile cagirmak tavsiye edilmez....

  String s  =StudentRepeat_WithMethod.getInitials("Ali Can");

        System.out.println(s);

//----------------------------------------------------------------------


    }
}
