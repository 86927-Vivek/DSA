package com.assignment01;

import java.util.Scanner;

/*Find rank of an element in an array of integers. rank: rank of a given integer "x" in the array, is "total no.
of ele's less than or equal to x (including x). Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
*/
public class Question7 {

	public static int rankOfAnArray(int[] arr,int key) {
		int count = 0;	
		for(int num:arr) {
			if(num<=key) {
				count++;
			}
		}
			return count;
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.print("Enter key - ");
		int key = sc.nextInt();
		int rank = rankOfAnArray(arr,key);
		System.out.println("Rank of an element "+key+" is "+rank+".");
		
		sc.close();
	}

	

}
