//class EmployeeInformation with details of Employee
package com.cg.employeeAndSavingsaccount;

public class EmployeeInformation {
	private int empID;
	private String empName;
	private String empDesignation;
	private int empSalary;
	// private String empComm;

	// Arg Ctor..
	public EmployeeInformation(int empID, String empName, String empDesignation, int empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	// toString method
	@Override
	public String toString() {
		return "EmployeeInformation: \n                   empID=" + empID + ","
				+ " Name=" + empName + ", Designation=" + empDesignation
				+ ", Salary=" + empSalary +"\n";
	}

	// Getters & Setters
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
