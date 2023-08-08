/* A4LiL.java */
import java.util.InputMismatchException;
import java.util.Scanner;
public class A4LiL {
/*
 * @param hours Integer  The parameter for storing the hour
 * @param minutes Integer The parameter for storing the minutes
 * @param seconds Integer The parameter for storing the seconds
 * @param elapsedSeconds long The parameter for storing the elapsedSeconds
 * */
	 public static void main(String[] args) {
	        int hours, minutes, seconds;
	        long elapsedSeconds;
	        
	        Time currentTime = new Time();
	        Scanner scanner = new Scanner(System.in);
	        
	        // Time 1 contains the current time
	        System.out.println("time 1");
	        System.out.println("Current Time (GMT): " + currentTime);
	        
	        // Time 2 is created using hours, minutes, and seconds by user's input
	        System.out.println("time 2");
	        System.out.print("Enter hours: ");
	        hours = readIntFromUser(scanner);
	        System.out.print("Enter minutes: ");
	        minutes = readIntFromUser(scanner);
	        System.out.print("Enter seconds: ");
	        seconds = readIntFromUser(scanner);
	        Time time2 = new Time(hours, minutes, seconds);
	        System.out.println(time2);
	        System.out.println("Elapsed seconds: " + time2.getElapsedSeconds());
	        
	        // Time 3 is created using elapsed seconds by user's input 
	        System.out.println("time 3");
	        System.out.print("Enter elapsed seconds: ");
	        elapsedSeconds = readLongFromUser(scanner);
	        Time time3 = new Time(elapsedSeconds);
	        System.out.println("Elapsed seconds: " + time3.getElapsedSeconds());
	        System.out.println(time3);

	        // Compare and return the difference between the Time 2 and Time 3’s elapsedSeconds fields.
	        System.out.println("time2.compareTo(time3): " + time2.compareTo(time3));

	        scanner.close();
	    }
	 
	// Utility method to read an integer from the user, handling exceptions for non-numeric input
	 private static int readIntFromUser(Scanner scanner) {
	     while (true) {
	         try {
	             return scanner.nextInt();
	         } catch (InputMismatchException e) {
	             System.out.print("Invalid input. Please enter a valid integer: ");
	             scanner.nextLine(); // Clear the input buffer
	         }
	     }
	 }

	 // Utility method to read a long from the user, handling exceptions for non-numeric input
	 private static long readLongFromUser(Scanner scanner) {
	     while (true) {
	         try {
	             return scanner.nextLong();
	         } catch (InputMismatchException e) {
	             System.out.print("Invalid input. Please enter a valid long integer: ");
	             scanner.nextLine(); // Clear the input buffer
	         }
	     }
	 }
}

