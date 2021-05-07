package com.java.array;

import java.util.Arrays;

public class Arraycopy {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		int b[]=Arrays.copyOfRange(a, 2,4);
		
	
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
