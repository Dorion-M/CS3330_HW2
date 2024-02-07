package edu.mu;
import edu.mu.student.*;

public class Main {

	public static void main(String[] args) {
		
        studentManager studentManager = new studentManager();
        
        //Checks if Scanner successfully reads the file
        boolean fileReadStatus = studentManager.readFromFile("src/dataFile/studentData.txt");
        
        // Display all students
        if (fileReadStatus) {
            studentManager.displayStudents();
        } else {
            System.out.println("Failed to read student data from file.");
        }
        
		
	}

}
