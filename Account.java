// Natalie Pedigo
// CS 2336.504
// Belkoura
// 9-10-2022
// This program creates a bank account and allows 
// operations on the users funds.
import java.util.Date;

public class Account {

	// private data fields to be used for objects of the account class
	// they are private to protect their data
	private int id;
	private double balance;
	private double annualInterestRate;
	private double monthlyInterestRate;
	private Date dateCreated = new Date();
	
	public static void main(String[] args) {
		
	}
	
	// this constructor creates an account with default values
	public Account() {
		Account Default = new Account();
		Default.id = 0;
		Default.balance = 0;
		Default.annualInterestRate = 0;
	
	}
	
	// creates account with specified ID number and balance
	public Account(int ID, double Balance) {
		this.id = ID;
		this.balance = Balance;
		
	}
	
	// mutates ID number
	public void setID (int ID) {
		this.id = ID;
	}
	 
	// mutates balance amount
	public void setBalance (double Balance) {
		 this.balance = Balance;
	}
	
	// mutates annual interest rate
	public void setAnnualInterestRate (double AnnualRate) {
		this.annualInterestRate = AnnualRate;
	}
	
	// accesses ID number
	public int getID() {
		return this.id;
	}
	
	// accesses balance amount
	public double getBalance() {
		return this.balance;
	}
	
	// accesses annual interest rate
	public double getAnnualRate() {
		return this.annualInterestRate;
	}
	
	// accesses date of which account is created
	public Date getDate() {
		return this.dateCreated;
	}
	
	// accesses monthly rate
	public double getMonthlyInterestRate() {
		return this.monthlyInterestRate;
	}
	
	// withdraws specified amount from balance, then assigns value to balance
	double withdraw(double withdrawAmount) {
		return balance -= withdrawAmount;
	}
	
	// deposits specified amount to balance, then assigns value to balance
	double deposit(double depositAmount) {
		return balance += depositAmount;
	}
	
	// prints details of an account to the console
	void printDetails() {
		System.out.println("ID: "+id+"\nBalance: "+balance+
				" \nMonthly Interest Rate: "+monthlyInterestRate+
				"% \nAnnual Interest Rate: "+annualInterestRate+
				"% \nDate Created: "+dateCreated);
	}
}


