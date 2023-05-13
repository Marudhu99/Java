package com.ashokIT.threadDemo;

public class SalaryCalculation implements Runnable {
	
	Employee employee = null;

	SalaryCalculation(Employee e) {
		this.employee = e;
	}

	@Override
	public void run() {
		double salary = employee.getBasicSalaryPerDay() * employee.getNoOfWorkingDays();
		employee.setSalary(salary);
	}
}
