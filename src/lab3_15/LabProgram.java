import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String input = scnr.next();

		System.out.println("Prefix: " + input.substring(0, 5));
	}
}
