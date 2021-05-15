package Excercise7Question4;

import java.util.ArrayList;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import sortingList.Student;

//import sortingList.Person;

public class MainStudent {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();	
		
		students.add(new Student("Hagos",20));
		students.add(new Student("Zeray",18));
		students.add(new Student("Tirhas",25));
		students.add(new Student("Seble",23));
		
		//Collections.sort(students);
      //  for (Student studentName: students) {
		
      //  System.out.println(students);
		
		/////////////Sorting students list with firstName////////////////
		
		 Collections.sort(students, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s1.getFirstName().compareTo(s2.getFirstName());
	            }
	        });
		 
		 for(Student studentName: students) {
	            System.out.println(studentName);
	}

		 System.out.println("\n");
		 
		 ////////////Sorting students list with Age//////////
		 
		 Collections.sort(students, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {

	                if(s1.getAge() > s2.getAge()) {
	                    return 1;
	                }
	                else if(s1.getAge() < s2.getAge()) {
	                    return -1;
	                }
	                
	                return 0;
	            }
	        });
		 
		 for(Student studentAge: students) {
	            System.out.println(studentAge);
}}
}