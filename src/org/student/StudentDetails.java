package org.student;

public class StudentDetails {
	private void StudentName() {
		System.out.println("Student NAme:Karan");

	}
	private void StudentID() {
		System.out.println("Student ID ME123");

	}
	private void StudentAddress() {
		System.out.println("Student Address:chennai");
	}

	private void studentBloodGroup() {
		System.out.println("Student Blood group:B+ve");
	}

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.StudentName();
		s.StudentID();
		s.StudentAddress();

	}

}
