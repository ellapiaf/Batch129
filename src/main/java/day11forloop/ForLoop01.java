package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {


        //Example 1: Verilen bir String' de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz.
        // "I love Java"==> "I love j"

        String s="i love Java";

        for(  int  i=0 ; i<s.length(); i++ ) {

            char ch =s.charAt(i);

            if (ch =='a') {
                break;
            }
                System.out.println(ch);// I love jv
            }
        System.out.println();

        //Example 2: Verilen bnir String'de son 'a' dan sonraki tum characterleri yazdiriniz.

        //"Germany" ==> yn

        String t="Germany";

        for(int i=t.length()-1;i>=0; i--){
            char ch=t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }
        }
    }

