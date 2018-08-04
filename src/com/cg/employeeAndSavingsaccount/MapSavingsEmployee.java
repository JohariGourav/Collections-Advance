// Class MapSavingsEmployee to create TreeMap of EmployeeInfo & SavingAccount together
package com.cg.employeeAndSavingsaccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapSavingsEmployee {

	public static void main(String[] args) {

		// initialising EmployeeInformation objects
		EmployeeInformation jatin = new EmployeeInformation(101, "Jatin", "Tech Lead", 50000);
		EmployeeInformation nisha = new EmployeeInformation(102, "Nisha", "Manager", 60000);
		EmployeeInformation Ravi = new EmployeeInformation(103, "Ravi", "Intern", 20000);
		EmployeeInformation kamal = new EmployeeInformation(104, "Kamal", "CRO", 80000);
		EmployeeInformation yash = new EmployeeInformation(105, "Yash", "COO", 90000);

		// initialising MMASavingAccount objects
		MMASavingAccount jatinAccount = new MMASavingAccount(301, "Jatin", 80000, true);
		MMASavingAccount nishaAccount = new MMASavingAccount(302, "Nisha", 100000, true);
		MMASavingAccount raviAccount = new MMASavingAccount(303, "Ravi", 120000, true);
		MMASavingAccount kamalAccount = new MMASavingAccount(304, "Kamal", 190000, true);
		MMASavingAccount yashAccount = new MMASavingAccount(305, "Yash", 500000, false);

		// TreeMap creation
		Map<EmployeeInformation, MMASavingAccount> map = new HashMap<>();

		map.put(jatin, jatinAccount);
		map.put(nisha, nishaAccount);
		map.put(Ravi, raviAccount);
		map.put(kamal, kamalAccount);
		map.put(yash, yashAccount);

		Set<Entry<EmployeeInformation, MMASavingAccount>> set = map.entrySet();

		for (Entry e : set) {
			System.out.println(e.getKey()  +""+ e.getValue());
		}
	}

}
