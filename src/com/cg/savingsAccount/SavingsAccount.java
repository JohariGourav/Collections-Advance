// Savings Account class for Arraylist and TreeSet
package com.cg.savingsAccount;

public class SavingsAccount implements Comparable<SavingsAccount> {

	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAccount;
	private int acc_balance;

	// Arg Ctor..
	public SavingsAccount(int acc_ID, String accountHolderName, boolean isSalaryAccount, int acc_balance) {
		super();
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
		this.acc_balance = acc_balance;
	}

	// Deposit method
	public void deposit(int amount) {
		acc_balance += amount;

	}

	// withdraw method
	public void withdraw(int amount) {
		acc_balance -= amount;
	}

	// ToString method
	@Override
	public String toString() {
		return "SavingsAccount [acc_ID=" + acc_ID + ", accountHolderName=" + accountHolderName + ", isSalaryAccount="
				+ isSalaryAccount + ", acc_balance=" + acc_balance + "]";
	}

	// compareTo method sorting on Account ID
	@Override
	public int compareTo(SavingsAccount arg0) {
		// TODO Auto-generated method stub
		return this.acc_ID - arg0.acc_ID;
	}

	// Getters & Setters
	public int getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

}
