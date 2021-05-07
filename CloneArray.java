package com.java.array;

public class CloneArray {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int clone[]=arr.clone();
		for(int i=0;i<clone.length;i++) {
			System.out.println(clone[i]);
		}
	}

}
