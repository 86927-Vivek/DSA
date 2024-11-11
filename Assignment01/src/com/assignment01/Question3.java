package com.assignment01;

import java.util.Scanner;

public class Question3 {

	public static int linearSearch(int[] eid, int id) {
		for(int i=0; i<eid.length; i++) {
			if(eid[i]==id) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linearSearch(String[] ename, String name) {
		for(int i=0; i<ename.length; i++) {
			if(ename[i].equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eid[]= {1,2,3,4,5,6,7,8};
		String ename[]= {"Vivek","Raju","Anirudh","acd","adc","bca","depu","harshit"};
		System.out.print("Enter employee id- ");
		int id = sc.nextInt();
		System.out.print("Enter employee name- ");
		String name = sc.next();
		int index = linearSearch(eid,id);
		int indexByName = linearSearch(ename,name) ;
		if(index !=-1) {
			System.out.println(id+" found.");
		}else {
			System.out.println("id not found.");
		}
		if(indexByName !=-1) {
			System.out.println(name+" found.");
		}else {
			System.out.println("Name not found.");
		}
	}

	

}
