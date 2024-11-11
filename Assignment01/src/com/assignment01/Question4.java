package com.assignment01;

import java.util.Scanner;

public class Question4 {

	public static int binarySearch(int[] arr, int key) {
		int left =0, right = arr.length-1, mid;
		while(left <= right) {
			mid = (left + right)/2;
			if(key == arr[mid])
				return key;			
			else if(key > arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {99,88,77,66,55,44,33,22,11};
		System.out.print("Enter the key- ");
		int key = sc.nextInt();
		int index = binarySearch(arr,key);
		if(index !=-1) {
			System.out.println(key+" Found.");
		}else {
			System.out.println("Element not found.");
		}
		sc.close();
	}

	

}
