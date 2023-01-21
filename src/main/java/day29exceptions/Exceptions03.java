package day29exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions03 {

    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("src\\main\\java\\day29exceptions\\File01");

            int k =0;

            while((k= fis.read())!=1){
                System.out.print((char)k);

            }
        } catch (IOException e) {
            System.out.println("Path is wrong or the file does not exist");


        }
    }
}
