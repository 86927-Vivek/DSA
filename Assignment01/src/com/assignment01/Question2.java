package com.assignment01;

import java.util.Scanner;

public class Question2 {


	public static int linearSearch(int[] arr, int key) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if(arr[i]==key) {
				return count;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length-1, mid, count=0;
		while(left <= right) {
			mid = (left + right)/2;
			count++;
			if(key == arr[mid])
				return count;			
			else if(key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int arr1[]= {88, 33, 66, 99, 11, 77, 22, 55, 14};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key...");
		int key = sc.nextInt();
		int indexOfBinarySearch = binarySearch(arr,key);
		int linearSearchIndex = linearSearch(arr1,key);
		if(linearSearchIndex != -1) {
			System.out.println("Number of comparisons for linear search: "+linearSearchIndex);
		}else {
			System.out.println(key+" not found.");
		}
		
		if(indexOfBinarySearch != -1) {
			System.out.println("Number of comparisons for binary search: "+indexOfBinarySearch);
		}else {
			System.out.println(key+" not found.");
		}
		sc.close();
	}
	
	


}
