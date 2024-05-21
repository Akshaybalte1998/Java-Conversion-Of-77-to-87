package com.arrayofobjectsutilitydemo;

import java.util.Scanner;

public class EmpArrayUtility {
	
	public static void acceptEmployeeDetails(Employee[] arr)
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the id-");
			int id=in.nextInt();
			System.out.println("Enter name-");
			String name=in.next();
			System.out.println("enter salary-");
			double salary=in.nextDouble();
			System.out.println("Enter designation 1.Software engg 2. Consultant 3. Senior consultant");
			int dcode=in.nextInt();
			DesignationCodes dcodevar=null;
			switch(dcode)
			{
			case 1:
				dcodevar=DesignationCodes.SOFTWAREENGG;
				break;
			case 2:
				dcodevar=DesignationCodes.CONSULTANT;
				break;
			case 3:
				dcodevar=DesignationCodes.SENIORCONSULTANT;
				break;
			}
			arr[i]=new Employee(id,name,salary,dcodevar);
		}
	}
	
	public static void displayEmployeeDetails(Employee [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static Employee findMaxSalEmp(Employee[] arr)
	{
		Employee maxSalEmp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].getSalary()>maxSalEmp.getSalary())
			{
				maxSalEmp=arr[i];
			}
		}
		return maxSalEmp;
	}
}
