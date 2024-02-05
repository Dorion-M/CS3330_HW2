package edu.mu;
import java.util.ArrayList;

import edu.mu.student.*;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Test" , 80.5);
		Student s2 = new Student(1,"Truman" , 80.5);
		
		System.out.println(s1.toString());	
		
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        
        System.out.println(studentList);


		
	}

}
