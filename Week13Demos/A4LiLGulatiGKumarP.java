//package Assignments;
import java.util.Scanner;
import java.util.InputMismatchException;

/* A4LiLGulatiGKumarP.java
 * 
 * The purpose of this program is to create a program that helps us determine the hour, minute and second of any given time. Specific steps are as follows :
 * 1. Get and output the current time (hours, minutes, and seconds.) 
 * 2. Get the time (hours, minutes, and seconds) entered by the user, convert it to elapsed seconds, and output. 
 * 3.Get the elapsed seconds entered by the user, compare the elapsed seconds with the output of 2., and return the difference between these two elapsed seconds.
 *  
 *  
 *  Revision History:
 * 		Li La
 * 			Created on: August 2nd, 2023
 * 
 *   	Garima Gulati
 *   		Created on: August 3rd, 2023
 *   	Li La	
 *   		Created on: August 4th, 2023
 *   	Garima Gulati
 *   		Created on: August 4th, 2023
 *  
 *  */

public class A4LiLGulatiGKumarP {
	
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
       // hours = readIntFromUser(scanner);
        hours = readIntFromUser(scanner, "hours");
        System.out.print("Enter minutes: ");
        minutes = readIntFromUser(scanner, "minutes");
        System.out.print("Enter seconds: ");
        seconds = readIntFromUser(scanner, "seconds");
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
	

// Utility method to read a long from the user, handling exceptions for non-numeric input and negative values.
	private static long readLongFromUser(Scanner scanner) {
	    while (true) {
	        try {
	            long value = scanner.nextLong();
	            if (value >= 0) {
	                return value;
	            } else {
	                System.out.print("Invalid input. Please enter a non-negative long integer: ");
	                scanner.nextLine(); // Clear the input buffer
	            }
	        } catch (InputMismatchException e) {
	            System.out.print("Invalid input. Please enter a valid long integer: ");
	            scanner.nextLine(); // Clear the input buffer
	        }
	    }
	}
// Utility method to read an integer from the user, handling exceptions for non-numeric input and negative values.
		   private static int readIntFromUser(Scanner scanner, String inputName) {
		        while (true) {
		            try {
		                int value = scanner.nextInt();
		                if (value >= 0) {
		                    return value;
		                } else {
		                    System.out.print("Invalid input. Please enter a non-negative integer for " + inputName + ": ");
		                    scanner.nextLine();
		                }
		            } catch (InputMismatchException e) {
		                System.out.print("Invalid input. Please enter a valid integer for " + inputName + ": ");
		                scanner.nextLine(); // Clear the input buffer
		            }
		        }
		    }

}


