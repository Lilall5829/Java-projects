import java.util.Date;

public class Account {
	// Data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// Constructors
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// The accessor and mutator methods for id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// The accessor and mutator methods for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// The accessor and mutator methods for annualInterestRate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	// The accessor method for dateCreated
	public Date getDateCreated() {
		this.dateCreated = new Date();
		return dateCreated;
	}
	
	// The method returns the monthly interest rate
	public double getMonthlyInterestRate(double annualInterestRate) {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	// The method returns the monthly interest
	public double getMonthlyInterest(double balance, double monthlyInterestRate) {
		double monthlyInterest = balance * monthlyInterestRate / 100;
		return monthlyInterest;
	}
	
	// The method withdraws a specified amount from the account
	public void withdraw(double withdraw) {
		double balance = getBalance();
		balance -= withdraw;
		setBalance(balance);
	}
	
	// The method deposits a specified amount from the account
	public void deposit(double deposit) {
		double balance = getBalance();
		balance += deposit;
		setBalance(balance);
	}
}
