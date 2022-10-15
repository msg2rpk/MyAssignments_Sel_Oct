package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{
	// This is an example of multilevel inheritance
	public void studentName() {
		System.out.println("From Student class - Student Name is: Kumar");
	}
	
	public void studentDept() {
		System.out.println("From Student class - Student Dept is: ECE");
	}
	
	public void studentId() {
		System.out.println("From Student class - Student Id is: 80106106034");
	}
	
	public static void main(String[] args) {
		//Department dept = new Department();
		Student student = new Student();
		
		student.studentName();
		student.studentDept();
		student.studentId();
		
		//Below Inherited
		System.out.println("************************Below Inherited************************");
		student.deptName();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		
	}

}
