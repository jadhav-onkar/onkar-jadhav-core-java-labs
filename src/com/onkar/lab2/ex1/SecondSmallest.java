package com.onkar.lab2.ex1;

import java.util.Scanner;

public class SecondSmallest {
	
	public static int secondSmallestNumber(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			
			if (arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Array: ");
		int len = sc.nextInt();
		
		while (len < 1) {
			System.out.print("Enter Length of Array: ");
			len = sc.nextInt();
		}
		
		int arr[] = new int[len];
		
		for (int i = 0; i < len; i++) {
			System.out.print("Enter number " + (i + 1) + " : ");
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		System.out.println("Second Smallest Number: " + SecondSmallest.secondSmallestNumber(arr));
		
		sc.close();
	}
}
