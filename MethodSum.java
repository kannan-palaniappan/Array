package com.java.array;

public class MethodSum {
	public static void main(String args[]) {
		int arr[]= {2,3,6,8,4};
		sum(arr);
	}
	static void sum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
