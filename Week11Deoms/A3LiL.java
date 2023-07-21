/* A3LiL.java
 * 
 * This program is to solve the following problem:
   Assume there are 100 lockers numbered 1 to 100 with 100 students lined up in front of those 100 lockers:
	•	The first student opens every locker.
	•	The second student closes every 2nd locker.
	•	The 3rd student changes every 3rd locker; if it’s closed, the student opens it; if it’s open, the student closes it.
	•	The 4th student changes every fourth locker.
	•	The 5th student changes every 5th locker.
	•	That same pattern continues for all 100 students.
	The problem is what’s the status(open/close) of each locker (from number 1 to 100).
 * 
 * Revision History:
 *     La Li 2023.07.18: Created
 */
import java.util.Date;
public class A3LiL {
	/*
	 * @param i Integer  The parameter for counting the number of students.
	 * @param j Integer  The parameter for counting the number of students.
	 * @param result String  The parameter for storing the state of current locker: open or close.
	 * @param lockers Boolean Array  The parameter for storing the state of each locker.  
     */
	public static void main(String[] args) {
		double balance, annualInterestRate,monthlyInterestRate,monthlyInterest;
		Date date;
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		annualInterestRate = account.getAnnualInterestRate();
		monthlyInterestRate = account.getMonthlyInterestRate(annualInterestRate);
		account.withdraw(2500);
		account.deposit(3000);
		balance = account.getBalance();
		monthlyInterest = account.getMonthlyInterest(balance, monthlyInterestRate);
		date = account.getDateCreated();
		System.out.println("Account Balance: $" + balance);
		System.out.println("Monthly Rate: " + monthlyInterestRate + "%");
		System.out.println("Monthly Interest: $" + monthlyInterest);
		System.out.println(date.toString());
	}

}
