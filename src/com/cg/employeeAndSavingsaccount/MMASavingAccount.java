//class MMASavingAccount having account details
package com.cg.employeeAndSavingsaccount;

public class MMASavingAccount {

	private int accountID;
	private String accountHolderName;
	private int accountBalance;
	private boolean isSalaryAccount;

	// Arg Ctor..
	public MMASavingAccount(int accountID, String accountHolderName, int accountBalance, boolean isSalaryAccount) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	// ToString method
	@Override
	public String toString() {
		return "MMASavingAccount: \n                   accountID=" + accountID + ", "
				+ "accountHolderName=" + accountHolderName
				+ ", Balance=" + accountBalance + ", SalaryAccount=" + isSalaryAccount + "\n -------------";
	}

	// Getters & setters
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

}
