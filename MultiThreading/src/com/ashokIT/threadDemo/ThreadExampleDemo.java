package com.ashokIT.threadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleDemo extends Thread {

	@Override
	public void run() {// Running state
		System.out.println("Thread starting");
	}
	// Dead

	public void display() {
		System.out.println("Display method");
	}

	public static void main(String[] args) { // Thread-1
		ThreadExampleDemo t1 = new ThreadExampleDemo();// New
		t1.start(); // Thread-2 Runnable pool

		ThreadExampleDemo t2 = new ThreadExampleDemo();
		t2.start(); // Thread-3

		t1.display();
		t1.run(); // Normal method execution

		// Thread Pool -Executors framework
		// 1.Single Thread Pool
		// 2.Cached Thread Pool
		// 3.Scheduled Thread Pool
		// 4.Fixed Thread Pool

		Employee e1 = new Employee(1, "Marudhu", 800, 22);
		Employee e2 = new Employee(2, "Arul", 200, 30);
		Employee e3 = new Employee(3, "Sarath", 1000, 20);
		Employee e4 = new Employee(4, "Vijay", 800, 300);
		Employee e5 = new Employee(5, "Paruthi", 1800, 22);
		Employee e6 = new Employee(6, "Kumaravel", 2800, 22);
		Employee e7 = new Employee(7, "Mugunthan", 100, 22);
		Employee e8 = new Employee(8, "Ashish", 500, 22);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);

		ExecutorService ex = Executors.newFixedThreadPool(3);
//		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();  //OS Based
		empList.forEach(employees -> {
			SalaryCalculation s = new SalaryCalculation(employees);
			ex.submit(s);
		});
		ex.shutdown();
		
		empList.forEach(employees->{
			String empName = employees.getEmpName();
			double salary = employees.getSalary();
			System.out.println(empName+":"+salary);
		});
	}

}
