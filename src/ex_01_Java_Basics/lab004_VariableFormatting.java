package ex_01_Java_Basics;

import java.sql.SQLOutput;

public class lab004_VariableFormatting {
    public static void main(String[] args) {


        int a = 30;
        int b = 56;
        double c = 76;
        float d = 12.456f;
        System.out.printf("value of a is %d , value of b is %d ", a, b);
        System.out.println();
        System.out.printf("a value: %d , b value : %d",a,b);// : used
        System.out.println();
        System.out.printf("a= %d , b = %d " ,a,b); // = used
        System.out.println();
        System.out.println("value of a is =" +a + " , " + "value of b is ="+b); //plus operator is used with print ln

    }
}