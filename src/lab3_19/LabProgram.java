import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      int seconds;
      int minutes;
      int hours;

      Scanner scnr = new Scanner(System.in);

      int totalSeconds = scnr.nextInt();

      hours = totalSeconds / 3600;
      minutes = (totalSeconds % 3600) / 60;
      seconds = totalSeconds % 60;

      System.out.println("Seconds: " + seconds);
      System.out.println("Minutes: " + minutes);
      System.out.println("Hours: " + hours);
      

   }
}
