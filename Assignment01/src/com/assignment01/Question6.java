package com.assignment01;
//Find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3
public class Question6 {

	public static int nonRepeatingNum(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					break;
				}
				if(j== len-1) {
					return i;
				}
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int len = arr.length;
		int index = nonRepeatingNum(arr,len);
		if(index !=-1) {
			System.out.println("Non Repeating element - "+arr[index]);
		}else {
			System.out.println("Non Repeating element does not exist..");
		}
	}

	
}
