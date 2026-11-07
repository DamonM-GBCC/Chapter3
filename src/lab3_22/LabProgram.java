import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);

      double radius = scnr.nextDouble();
      double height = scnr.nextDouble();

      double volume = Math.PI * Math.pow(radius, 2) * height;

      double area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);

      System.out.printf("Volume (cubic inches): %.2f\n", volume);
      System.out.printf("Surface area (square inches): %.2f\n", area);
	   
   }
}
