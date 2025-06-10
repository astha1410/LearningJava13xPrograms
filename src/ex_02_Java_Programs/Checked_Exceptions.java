package ex_02_Java_Programs;

public class Checked_Exceptions {

    public static void main(String[] args) {
        System.out.println("this is line 1");
        System.out.println("this is line 2");
try{
        Thread.sleep(5000); // red cross will tell the exception, copy it in catch block
    } catch (InterruptedException e) {
    throw new RuntimeException(e);
}
        System.out.println("this is line 3");
        System.out.println("this is line 4");
}
}
