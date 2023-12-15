package Student.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class StudentModel {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
private String rollNo;
public StudentModel(int id, String rollNo, String name, Gender gender, Grade grade, int age, double marks) {
	super();
	this.id = id;
	this.rollNo = rollNo;
	this.name = name;
	this.gender = gender;
	this.grade = grade;
	this.age = age;
	this.marks = marks;
}
private String name;
private Gender gender;
private Grade grade;
private int age;
private double marks;



}
