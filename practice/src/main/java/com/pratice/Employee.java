package com.pratice;

public class Employee {
	 private int employeeid;
	 private String Name;
	 private int Salary;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee(int employeeid, String name, int salary) {
		super();
		this.employeeid = employeeid;
		Name = name;
		Salary = salary;
	}
	
}
