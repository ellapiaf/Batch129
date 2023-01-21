package day11forloop;





public class ForLoop03 {

    public static void main(String[] args) {

        //Example 1:Size verilen bir String'i tersten yazdiriniz.

        String s="java";
        String t ="";

    for(int i=s.length()-1; i>=0 ;i--){
    t=t+s.charAt(i);
}
        System.out.println(t);



    //Example 2 : size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
  // civic,nalan,kucuk,11211 ==> palindrome


        //Logic: String'i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.


        String duz="civic";

        String ters="";

        for(int i=duz.length()-1; i>=0;i--){

         ters   =   ters+duz.charAt(i);



        }
        if(duz.equals(ters)){
            System.out.println(duz +  " palindrome'dur.");
        }else{
            System.out.println(duz+ " palindrome degildir.");
        }
    }

        }



