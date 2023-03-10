package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {

    public static void main(String[] args) {


        //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
        //     "Java is easy. Java is OOP.OOP makes Java easy." ==> Java=3 , is=2, easy=2, OOP=2,makes=1

        //Note bu soru Map yapisi o yuznden map kullanacagiz.

        HashMap<String, Integer> wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";

     sentence=   sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

      String [] wordsArray= sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));//[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

      for (String w:wordsArray){

     Integer numOfOccurrence =   wordsMap.get(w);



     if (numOfOccurrence==null){
         wordsMap.put(w,1);


     }else{
         wordsMap.put(w,numOfOccurrence+1);
     }

      }
        System.out.println(wordsMap);//{Java=3, OOP=2, makes=1, is=2, easy=2}

    }
}
