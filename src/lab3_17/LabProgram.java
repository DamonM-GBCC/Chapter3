import java.util.Scanner;

public class LabProgram {
   
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String input = scnr.next();

		int start = (input.length() - 5) / 2;

		System.out.println("Midfix: " + input.substring(start, start + 5));

	}
}
