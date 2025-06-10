package ex_01_Java_Basics;

import java.util.Scanner; // to get input from user


public class Mini_Project_Guess_A_Random_Number {

    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);// get input from user

    int myNumber = (int)(Math.random()*100);

    int UserNumber=0; // declared outside do loop so that can be used without error elsewhere

    /*random method generates a random number between 0 to 1,
     * 100 converts it in form 79.hjsbs
     (int) is used to remove decimals after * with 100 ,
     so a random 2 digit number is generated*/

    do{
        System.out.println("Guess the number between 1 to 100 ");
         UserNumber = sc.nextInt(); // gets input from user

        if(UserNumber==myNumber) {
            System.out.println("you have guessed correctly");
            break;
        }
            else if (UserNumber > myNumber) {
            System.out.println("your number is larger, guess again");
        }
            else {
            System.out.println("your number is small, guess a bigger number");
        }

    } while (UserNumber >= 0);

        System.out.print("my number was :");
        System.out.println(myNumber);


}
}
