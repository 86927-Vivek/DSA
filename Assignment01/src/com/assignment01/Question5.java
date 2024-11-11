package com.assignment01;

import java.util.Scanner;

public class Question5 {

	public static int linearSearch(int[] arr1, int key, int occurence) {
		int counter =0;
		for(int i=0; i<=arr1.length-1;i++) {
			if(arr1[i]==key) {
				counter++;
			}
			if(counter==occurence) {
				return i;
			}
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr1[]= {88, 33, 66, 88, 11, 88, 88, 55, 14};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key...-");
		int key = sc.nextInt();
		System.out.print("Enter occurence:- ");
		int occurence = sc.nextInt();
		int index = linearSearch(arr1,key,occurence);
		if(index !=-1) {
			System.out.println("Index of the "+occurence+"th occurence is-"+index);
		}else {
			System.out.println("Index not found.");
		}
		sc.close();
	}

	

}
