package ex_02_Java_Programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}


/* do while
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";
        int i = str.length() - 1;

        do {
            reversed += str.charAt(i);
            i--;
        } while (i >= 0);

        System.out.println("Reversed: " + reversed);
    }
} */
