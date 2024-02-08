package edu.mu.student;
import java.io.*;
import java.util.Scanner;


public class studentManager {
	
	// Array to store student objects
	private Student[] students;
	
	//Student Getter
	public Student[] getStudents() {
		return students;
	}
	// Student Setter
	public void setStudents(Student[] students) {
		this.students = students;
	}

	// Reads data from provided txt file
	public boolean readFromFile(String fileName) {
	    try (Scanner scanner = new Scanner(new FileInputStream(new File(fileName)))) {
	        int count = 0;
	// Reads file line by line
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] parts = line.split("\\s+"); // Split line by whitespace

	// Checks if there are exactly four parts (id, first name, last name, grade) and separates the data into individual parts
	            if (parts.length == 4) {
	                int id = Integer.parseInt(parts[0]);
	                String name = parts[1] + " " + parts[2]; // Joins first name and last name
	                double grade = Double.parseDouble(parts[3]);
	// Allows for new students to be added to the array
	                if (students == null) {
	                    students = new Student[1];
	                } else {
	                    Student[] temp = new Student[students.length + 1];
	                    System.arraycopy(students, 0, temp, 0, students.length);
	                    students = temp;
	                }
	// Creates new instance of Student based off the data read from the current line in the file
	                students[count++] = new Student(id, name, grade);
	            } else {
	                System.err.println("Invalid data format in file: " + fileName);
	                return false;
	            }
	        }
	        return true;
	    } catch (FileNotFoundException e) {
	        System.err.println("File not found: " + fileName);
	        return false;
	    } catch (NumberFormatException e) {
	        System.err.println("Invalid number format in file: " + fileName);
	        return false;
	    }
	}

	// Displays student info
    public void displayStudents() {
        if (students == null || students.length == 0) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                if (student != null) {
                    System.out.println(student.toString());
                }
            }
        }
    }
    
    public boolean searchStudentById(int id) {
    	for(Student student : students) {
//    		Student find = new Student(id,student.getName(),student.getGrade());
//    		if(student.equals(find)){
            if(student.getId() == id) {
    			System.out.println("\n"+student.toString());
                return true;
    		}
    	}
		return false;
    }
    
    // Uses the search method to update the student's grade from the given ID.
    public boolean updateStudentGradeById(int id, Double grade) {
    	boolean existStudent = searchStudentById(id);
    	if(!existStudent)
    	{
    		System.out.println("There is no ID");
    		return false;
    	}
    	else
    	{
    		for(Student student : students)
    		{
    			if(student.getId() == id)
    			{
    				student.setGrade(grade);
    				System.out.println("There is an ID and it has been changed");
    				return true;
    			}
    		}
    		return false;
    	}
    }
}
