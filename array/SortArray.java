package com.inputArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		   if (size <= 0) {
	            System.out.println("Array size must be a positive integer.");
	            return; // Exit the program
	        }
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" enter the "+i+" array elemnet");
			array[i]=scan.nextInt();
		}
		System.out.println("array element in given order");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//Using sort() method inbuilt
		Arrays.sort(array);
		System.out.println(" arrays sort using inbuit sort method");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//copyOf() method
		
		int array2[]=Arrays.copyOf(array,size);
		System.out.println(" arrays copy using copyOf method");
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		
		
	}

}
