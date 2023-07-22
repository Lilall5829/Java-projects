/* A3LiL.java
 * 
 * This program is to solve the following problem:
   Create an Account object with account ID, balance, and annual interest rate. Use the withdraw and deposit method to withdraw and deposit a specified amount to the account. Print the balance, the monthly interest rate, the monthly interest amount, and the date when this account was created.
 * 
 * Revision History:
 *     La Li 2023.07.18: Created
 */
import java.util.Date;
public class A3LiL {
	/*
	 * @param balance double  The parameter for storing the balance.
	 * @param annualInterestRate double  The parameter for storing the annual interest rate.
	 * @param monthlyInterestRate double  The parameter for storing the monthly interest rate.
	 * @param monthlyInterest double  The parameter for storing the monthly interest.  
	 * @param date Date  The parameter for storing the current date.
     */
	public static void main(String[] args) {
		double balance, annualInterestRate,monthlyInterestRate,monthlyInterest;
		Date date;
		
		// Create an Account object with an account ID of 1122, a balance of $20,000
		Account account = new Account(123456789, 5000);
		// Set annual interest rate to 4.5%
		account.setAnnualInterestRate(0.7);
		annualInterestRate = account.getAnnualInterestRate();
		// Calculate the monthly interest rate
		monthlyInterestRate = account.getMonthlyInterestRate(annualInterestRate);
		// Withdraw $2500 from the account
		account.withdraw(3000);
		// Deposit $3000 from the account
		account.deposit(1000);
		// Calculate the balance after withdrawing and depositing
		balance = account.getBalance();
		// Calculate the monthly interest
		monthlyInterest = account.getMonthlyInterest(balance, monthlyInterestRate);
		// Get the current date
		date = account.getDateCreated();
		
		// Print output
		System.out.println("Account Balance: $" + balance);
		System.out.printf("Monthly Rate: %.2f%%%n", monthlyInterestRate);
		System.out.printf("Monthly Interest: $%.2f%n",monthlyInterest);
		System.out.println(date.toString());
	}

}
