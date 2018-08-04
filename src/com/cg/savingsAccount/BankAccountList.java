//class BankAccountList for creating TreeSet of SavingsAccount
package com.cg.savingsAccount;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount1 = new SavingsAccount(101, "Ravi", true, 0);
		SavingsAccount savingsAccount2 = new SavingsAccount(102, "Ankush", false, 0);
		SavingsAccount savingsAccount3 = new SavingsAccount(103, "Reena", true, 500);
		SavingsAccount savingsAccount4 = new SavingsAccount(104, "Dewank", true, 1500);
		SavingsAccount savingsAccount5 = new SavingsAccount(105, "Sachin", false, 2000);
		//duplicate entry : Rejected
		SavingsAccount savingsAccount6 = new SavingsAccount(105, "Sam", true, 1000);
		
		Set<SavingsAccount> savingsAccount = new TreeSet<>();
		
		savingsAccount.add(savingsAccount1);
		savingsAccount.add(savingsAccount2);
		savingsAccount.add(savingsAccount3);
		savingsAccount.add(savingsAccount4);
		savingsAccount.add(savingsAccount5);
		savingsAccount.add(savingsAccount6);
		
		//Printing accounts
		for(SavingsAccount sa : savingsAccount) {
			System.out.println(sa);
		}

	}

}
