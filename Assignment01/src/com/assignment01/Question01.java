package com.assignment01;

import java.util.Scanner;

public class Question01 {
	public static int linearSearch(int[] arr, int key) {
		for (int i = arr.length-1; i >= 0; --i) {
			if(arr[i]==key)
				return i;
		}
		return -1;

	}
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 11, 77, 88, 99};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched....");
		int key = sc.nextInt();
		int index = linearSearch(arr,key);
		if(index != -1) {
			System.out.println(key+" element found at index- "+index);
			
		}else {
			System.out.println(key+" element not found....");
		}
		sc.close();
	}


}
