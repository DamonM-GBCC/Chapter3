import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double a = scnr.nextDouble();
		double b = scnr.nextDouble();
		double c = scnr.nextDouble();

		double s = (a + b + c) / 2.0;

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.printf("Triangle area = %.2f\n", area);

	}
}
