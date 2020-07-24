package com.vnrvjiet.java8Task;
import java.util.ArrayList;
import java.util.Scanner;


public class averageTask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the size of list:");
		int size=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter numbers:");
		for(int i=0;i<size;i++)
		{
			int number=sc.nextInt();
			al.add(number);
			
		}
		
		al.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println("Average"+"="+ avg));

	}
}
