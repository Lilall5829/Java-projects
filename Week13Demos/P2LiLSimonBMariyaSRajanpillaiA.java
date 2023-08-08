import java.sql.*;
import java.util.Scanner;
/* P2LiLSimonBMariyaSRajanpillaiA.java
 * 
 *  The purpose of the problem is: views, inserts, updates, and deletes staff information stored in a MySQL database. This program will have the following functionality: 
-	The View option displays a record with a specified ID, (return a Staff object). 
-	The View All option displays all records sorted by age in ascending order. Do not use SQL ORDER BY to sort records. Instead sort your collection. 
-	The Insert option inserts a new record, (Prevent inserting record with the same first name, last name, and age).
-	The Update option updates the record for the specified ID. 
-	The Delete option deletes the record for the specified ID.

 *
 *  
 *  
 *  Revision History:
 * 		Li La
 * 			Created on: August 5th, 2023
 *    	Li La	
 *   		Modified on: August 6th, 2023

 *  
 *  */

public class P2LiLSimonBMariyaSRajanpillaiA {
/*
	 * @param choice String  The parameter for storing the choice of user
	 * @param db DBCrud The parameter for storing an object of DBCrud
 * */

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
    	String choice;
		DBCrud db = new DBCrud();
		Connection connection = db.getConnection();
	        do{
	            System.out.println("\nMenu:");
	            System.out.println("1. View by ID");
	            System.out.println("2. View All");
	            System.out.println("3. Insert");
	            System.out.println("4. Update");
	            System.out.println("5. Delete");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

				choice = input.nextLine();

	            switch (choice) {
                case "1":
                    System.out.print("Enter staff ID: ");
                    String idToView = input.nextLine();
                    db.viewStaffById(idToView);;
                    break;
                case "2":
                    db.viewAllStaff();
                    break;
                case "3":
                    System.out.print("Enter staff ID: ");
                    String idToAdd = input.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = input.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter middle initial: ");
                    String mi = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine(); 
                    while (age <= 0 || age > 120) {
                        System.out.print("Please enter an positive number less than 120: ");
                        age = input.nextInt();
                        input.nextLine(); 
                    }
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    System.out.print("Enter city: ");
                    String city = input.nextLine();
                    System.out.print("Enter state: ");
                    String state = input.nextLine();
                    System.out.print("Enter telephone: ");
                    String telephone = input.nextLine();
                    System.out.print("Enter email: ");
                    String email = input.nextLine();

                    Staff newStaff = new Staff(idToAdd, lastName, firstName, mi, age, address, city, state, telephone, email);
                    db.insertStaff(newStaff);
                    break;
                case "4":
                    System.out.print("Enter staff ID to update: ");
                    String idToUpdate = input.nextLine();
                    Staff updatedStaff = db.findStaffById(idToUpdate);
                    if (updatedStaff != null) {
                        System.out.print("Enter first name: ");
                        updatedStaff.setFirstName(input.nextLine());
                        System.out.print("Enter last name: ");
                        updatedStaff.setLastName(input.nextLine());
                        System.out.print("Enter middle initial: ");
                        updatedStaff.setMi(input.nextLine());
                        System.out.print("Enter age: ");
                        updatedStaff.setAge(input.nextInt());
                        input.nextLine(); 
                        System.out.print("Enter address: ");
                        updatedStaff.setAddress(input.nextLine());
                        System.out.print("Enter city: ");
                        updatedStaff.setCity(input.nextLine());
                        System.out.print("Enter state: ");
                        updatedStaff.setState(input.nextLine());
                        System.out.print("Enter telephone: ");
                        updatedStaff.setTelephone(input.nextLine());
                        System.out.print("Enter email: ");
                        updatedStaff.setEmail(input.nextLine());

                        db.updateStaff(idToUpdate, updatedStaff);
                    } else {
                        System.out.println("Staff with ID " + idToUpdate + " not found.");
                    }
                    break;
                case "5":
                    System.out.print("Enter staff ID to delete: ");
                    String idToDelete = input.nextLine();
                    db.deleteStaff(idToDelete);
                    break;
                case "6":
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option from the menu.");
                    break;
	            }
            }while (!choice.equals("6"));

			System.out.println("Bye for now");
			connection.close();
	}    
	
}
