package com.studentpojo;

public class Student {

	private String name;
	private int StudentRollNo;
	private String Studentname;
	private String Studentaddress;
	private String phoneno;
	private String degree;
	
	public Student(String name, int studentRollNo, String studentname, String studentaddress, String phoneno,
			String degree) {
		super();
		this.name = name;
		StudentRollNo = studentRollNo;
		Studentname = studentname;
		Studentaddress = studentaddress;
		this.phoneno = phoneno;
		this.degree = degree;
	}
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentRollNo() {
		return StudentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getStudentaddress() {
		return Studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	
}
