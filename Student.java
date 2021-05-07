package com.java.array;

public class Student {
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public static void main(String args[]) {
		Student[] arr=new Student[5];
		arr[0]=new Student(1,"kannan");
		arr[1]=new Student(1,"siva");
		arr[2]=new Student(1,"soundar");
		arr[3]=new Student(1,"srini");
		arr[4]=new Student(1,"somu");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("rollno "+" "+arr[i].rollno+" name "+" "+arr[i].name);
		}
	}

}
