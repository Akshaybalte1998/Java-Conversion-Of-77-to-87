package com.primitivearrayUtilitydemo;

import java.util.Scanner;

public class ArrayUtiliyClass {
	
	public static void acceptArrayElements(int [] arr)
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element:");
			arr[i]=in.nextInt();
		}
	}

	public static void displayArrayElements(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void sumOfElements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("the sum of all element "+sum);		
	}
}
