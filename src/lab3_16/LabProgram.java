import java.util.Scanner;

public class UsingMathMethods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = scnr.next();

        System.out.println("Postfix: " + input.substring(input.length() - 5));
    }
}
