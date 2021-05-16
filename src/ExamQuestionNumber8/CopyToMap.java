package ExamQuestionNumber8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyToMap {

		public class Student {
			private Integer id;
			private String name;
			// create constructor for reference
			public Student(Integer id, String name){
			this.id = id;
			this.name = name;
			
			}
			
			public Integer getId(){
				return id;
				}
				public String getName(){
				return name;
				}
				}
				public class ListToMap {
					
				public void main(String[] args){
					
				List<Student> students = new ArrayList<Student>();
				students.add(new Student(1, "Equar"));
				students.add(new Student(2, "Amanuel"));
				students.add(new Student(3, "Hawaz"));
				// create Map object
				// put every list element to the Map using the IDs
				//as keys and the names as values
				
				
				Map<Integer, String> map = new HashMap<>();
				  
		        // put every value list to Map
		        for (Student stu : students ) {
		            map.put(stu.getId(), stu.getName());
		        }
		  
		        // print map
		        System.out.println("Map  : " + map);
		    }
		}}
				
				
			/*
			 * } Map<Integer, String> studentMap = new HashMap<> ();
			 * 
			 * for (Student student : students); } StudentMap.put(student.getId(),
			 * student.getName()); } }
			 */