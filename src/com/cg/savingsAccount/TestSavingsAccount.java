//class TestSavingsAccount for creating ArrayList of SavingsAccount
package com.cg.savingsAccount;

import java.util.ArrayList;
import java.util.List;

public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount savingsAccount1 = new SavingsAccount(101, "Ravi", true, 0);

		SavingsAccount savingsAccount2 = new SavingsAccount(102, "Ankush", false, 0);

		SavingsAccount savingsAccount3 = new SavingsAccount(103, "Reena", true, 500);

		SavingsAccount savingsAccount4 = new SavingsAccount(104, "Dewank", true, 1500);

		SavingsAccount savingsAccount5 = new SavingsAccount(105, "Sachin", false, 2000);

		List<SavingsAccount> savingsAccount = new ArrayList<>();

		savingsAccount.add(savingsAccount1);
		savingsAccount.add(savingsAccount2);
		savingsAccount.add(savingsAccount3);
		savingsAccount.add(savingsAccount4);
		savingsAccount.add(savingsAccount5);

		for (SavingsAccount sa : savingsAccount) {
			System.out.println(sa);
		}

	}

}
