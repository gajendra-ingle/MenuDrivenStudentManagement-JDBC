package com.StudentManagementCRUD;

public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;
	private double sgpa;
	private String studentPhNumber;

	public Student() {
	}

	public Student(int studentId, String studentName, int studentAge, double cgpa, String studentPhNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.sgpa = cgpa;
		this.studentPhNumber = studentPhNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getCgpa() {
		return sgpa;
	}

	public void setCgpa(double cgpa) {
		this.sgpa = cgpa;
	}

	public String getStudentPhNumber() {
		return studentPhNumber;
	}

	public void setStudentPhNumber(String studentPhNumber) {
		this.studentPhNumber = studentPhNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", cgpa=" + sgpa + ", studentPhNumber=" + studentPhNumber + "]";
	}

}