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
            
            boolean studentFound = studentManager.searchStudentById(102);
            System.out.println("Student found: " + studentFound);

         // Update the grade of a student by ID.
            boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, (double) 95);
            System.out.println("Student updated: " + studentGradeUpdateStatus);
            
            studentManager.displayStudents();
            
        } else {
            System.out.println("Failed to read student data from file.");
        }
        
        	

		
	}

}
