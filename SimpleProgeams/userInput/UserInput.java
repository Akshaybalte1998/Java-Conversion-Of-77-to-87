package com.userInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number: ");
		int number=scan.nextInt();
		System.out.println("enter the string value: ");
		String name=scan.next();
		System.out.println("enter the double value for salary");
		double salary=scan.nextDouble();
		System.out.println(" number :"+number+"  name: "+name+" salary: "+salary);
		
		
	}

}
