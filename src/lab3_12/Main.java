package lab3_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int x;
        double y = 0.0;

        x = scnr.nextInt();

        y = (1.0 / 3) * x + (x / 4.0) + 2 * x;

        System.out.println(y);
    }
}


