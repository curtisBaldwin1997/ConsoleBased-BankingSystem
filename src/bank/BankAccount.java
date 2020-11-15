package bank;

import java.util.Random;

public abstract class BankAccount {
	
	protected double balance;
	protected String sortcode;
	protected String accountNumber;
	public BankAccount() {
		
		this.balance = 0;
		this.sortcode = "";
		this.accountNumber = "";
		
	}
	
	abstract double getBalance();

	public void withdraw(double moneyWithdrawn) {
	this.balance -= moneyWithdrawn;
	}
	public void deposit(double depositAmount) {
	this.balance += depositAmount;
	}
	
	public String getRandomSortcode() {
		Random rnd = new Random();
		int newSortcode = rnd.nextInt(999999);
		
		return sortcode += String.format("%06d", newSortcode);
	}
	
	public String getRandomAccountNumber() {
		Random rnd = new Random();
		int newAccountNum = rnd.nextInt(999999);
		
		return accountNumber += String.format("%08d", newAccountNum);
	}
	
	
	
}
