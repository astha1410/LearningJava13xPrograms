package ex_01_Java_Basics;  //Folder in java

public class HelloWorld {
    public static void main(String[] args)
    // main method, JVM recognises this and starts execution
    {
        System.out.println("Hello, World!");
        // system in itself is a class, println is a method or a pre defined fx.
        //methods are functions written in classes in java.
        //out is a static variable of type printstream.
        //printstream class has a method called println.

        // while execution if no error, exit code is 0
        //if error , exit code is 1
        // sout tab or enter is a shortcut for printing a statement in intellij
        System.out.print("hi");
        System.out.print("observe no space is their after hi"); // doesn't add a line after printing

    }
}