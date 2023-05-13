package com.ashokIT.threadDemo;

public class Employee {
	private long empId;
	private String empName;
	private double salary;
	private double basicSalaryPerDay;
	private int noOfWorkingDays;

	public Employee() {
		super();
	}

	public Employee(long empId, String empName, double basicSalaryPerDay, int noOfWorkingDays) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalaryPerDay = basicSalaryPerDay;
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSalaryPerDay() {
		return basicSalaryPerDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBasicSalaryPerDay(double basicSalaryPerDay) {
		this.basicSalaryPerDay = basicSalaryPerDay;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

}
