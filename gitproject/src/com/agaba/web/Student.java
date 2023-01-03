package com.agaba.web;

public class Student implements Comparable<Student> {

	private String name;
	private int student_id;
	private String level;
	
	public Student(String name, int student_id, String level) {
		super();
		this.name = name;
		this.student_id = student_id;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public int compareTo(Student o) {
		return  this.student_id - o.student_id;
	}
	
	@Override
	public int hashCode() {
		return this.student_id;
	}	
}
