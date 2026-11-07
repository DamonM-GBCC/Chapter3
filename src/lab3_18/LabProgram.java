import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;

      Scanner scnr = new Scanner(System.in);

      seconds = scnr.nextInt();
      minutes = scnr.nextInt();
      hours = scnr.nextInt();

      int totalSeconds = seconds + (minutes * 60) + (hours * 3600);

      System.out.println(totalSeconds + " seconds");
      
      
   }
}
