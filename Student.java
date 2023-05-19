package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("Inside Student -> Student Name: prakash");
	}
	public void studentDept() {
		System.out.println("Inside Student -> Student dept: IT");
	}
	public void studentId() {
		System.out.println("Inside Student -> Student Id: 1243");
	}
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.department();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
	
}
}