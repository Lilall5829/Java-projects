import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		this.dateCreated = new Date();
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(double annualInterestRate) {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(double balance, double monthlyInterestRate) {
		double monthlyInterest = balance * monthlyInterestRate / 100;
		return monthlyInterest;
	}
	
	public void withdraw(double withdraw) {
		double balance = getBalance();
		balance -= withdraw;
		setBalance(balance);
	}
	
	public void deposit(double deposit) {
		double balance = getBalance();
		balance += deposit;
		setBalance(balance);
	}
}
