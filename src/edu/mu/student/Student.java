package edu.mu.student;

public class Student {
	private int id;
	private String name;
	private Double grade;
	
	
	// Default constructor
    public Student() {
    }
    // parameterized constructor 
	public Student(int id, String name, Double i) {
		this.id = id;
		this.name = name;
		this.grade = i;
	}
	
	//Getter + setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	//toString
	public String toString() {
		return "id = " + id + ", name = " + name + ", grade = " + grade + "";
	}
	
	
	
	
	
}


