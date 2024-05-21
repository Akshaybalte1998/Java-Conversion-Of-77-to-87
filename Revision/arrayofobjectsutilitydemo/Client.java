package com.arrayofobjectsutilitydemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emparr=new Employee[3];	  //array of references	
		EmpArrayUtility.acceptEmployeeDetails(emparr);
		EmpArrayUtility.displayEmployeeDetails(emparr);
		Employee maxSalEmp=EmpArrayUtility.findMaxSalEmp(emparr);
		System.out.println("the employee having maximum salary is");
		System.out.println(maxSalEmp);

	}

}
