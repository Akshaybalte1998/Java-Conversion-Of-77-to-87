package com.arrayofobjectsutilitydemo;

public class Employee {
	
	private int empid;
	private String name;
	private double salary;
	private DesignationCodes designation;
	
	public Employee(int empid, String name, double salary,DesignationCodes designation)
	{
		this.empid=empid;
		this.name=name;
		this.salary= salary;
		this.designation=designation;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public DesignationCodes getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationCodes designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empid-"+this.empid
				+" Name-"+this.name
				+" Salary-"+this.salary
				+" Desigation-"+this.designation;
	}

}
