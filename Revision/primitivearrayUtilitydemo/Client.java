package com.primitivearrayUtilitydemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
			
		Scanner in =new Scanner(System.in);
		int[] arr1=new int[5];
		while(true)
		{
			System.out.println("Menu-----");
			System.out.println("1. Accept elements");
			System.out.println("2. Display all elements");
			System.out.println("3. Display sum of all elements");
			System.out.println("Enter your choice:");
			int choice=in.nextInt();
			switch(choice)
			{
			case 1:
				ArrayUtiliyClass.acceptArrayElements(arr1);
				break;
			case 2:
				ArrayUtiliyClass.displayArrayElements(arr1);
				break;
			case 3:
				ArrayUtiliyClass.sumOfElements(arr1);
				break;
			default:
				return;
			}
		}

	}

}
