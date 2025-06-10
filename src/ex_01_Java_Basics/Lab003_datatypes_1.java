package ex_01_Java_Basics;

public class Lab003_datatypes_1 { // main and enter gives main method
    public static void main(String[] args) {

        // primitive datatypes
        /* byte - 1 byte memory (-128 to 127)
        short - 2 byte memory
        int -4 byte memory
        long - 8 byte memory ( L is used)
        float -4 byte memory (has decimal values , F is used)
        double - 8 byte memory (has decimal values)
        char - 2 byte memory ( a, b, c, d)
        boolean - 1 byte memory  ( only 2 values , default is false) */

        byte age = 30;
        int phone = 1234567890;
        long phone1 = 12345678900L; // small l can also be written
        float pi = 3.14F; // small f can also be written
        boolean isadult = true;
        char letter = 'a';

      //   System.out.println(age+ phone+ phone1+  pi+ isadult+ letter); // float and boolean are giving error
        System.out.println(age+ phone+ phone1 + letter); // gives garbage value

        // Non - Primitive Datatypes
        //String










    }
}
