package ex_02_Java_Programs;

public class FinallyBlock {

    public static void main(String[] args) {
    String s = null;

    try{
        System.out.println(s.length());
    }
    catch(Exception e)

    {
        System.out.println("cant catch exception");
        System.out.println(e.getMessage());
    }

    finally // executes regardless exception handled or not
    {
        System.out.println("you have anyways executed finally block");
    }
        System.out.println("program finished");
    }
}
