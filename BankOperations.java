// Natalie Pedigo
// CS 2336.504
// Belkoura
// 9-10-2022
// This program creates a bank account and allows 
// operations on the users funds.

public class BankOperations {

	public static void main(String[] args) {
		
		// instance of the account class
		// account b is assigned specific values for its 
		// ID number, balance, and annual rate. 
		Account accountOne = new Account(1122, 20000);
		accountOne.setAnnualInterestRate(4.5);
		accountOne.withdraw(2500);
		accountOne.deposit(3000);
		accountOne.printDetails();
		
		accountOne.setID(73847);
	}


}
