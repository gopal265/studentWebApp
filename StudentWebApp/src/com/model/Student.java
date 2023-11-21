package com.model;

public class Student {

	private int studentId;
	private String firstName;
	private String lastName;
	private String branch;
	private int year;
	private String gender;
	private int age;
	private String emailId;
	private String password;
	private double marks;

	
	public Student() {
		super();
	}
	
	public Student(int studentId, String firstName, String lastName, String branch, int year,String gender, int age,String emailId,
			String password, double marks) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.year = year;
		this.setGender(gender);
		this.age = age;
		this.emailId = emailId;
		this.password = password;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", branch="
				+ branch + ", year=" + year + ", gender=" + gender + ", age=" + age + ", emailId=" + emailId
				+ ", password=" + password + ", marks=" + marks + "]";
	}

	




	

	
}
