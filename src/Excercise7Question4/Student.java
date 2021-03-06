//4. Given Student class sort students list with their first name using comparable interface

package Excercise7Question4;


public class Student implements Comparable<Student>{
	
	private String firstName;
	private int age;
	
	
	
	public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	



	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return firstName +":" + age;
	}




	@Override
	public int compareTo(Student o) {
		
		return this.getFirstName().compareTo(o.getFirstName());

		
	}
	/*
	 * public class Student implements Comparable< Student >{
	 * 
	 * private String firstName; }
	 */
		
}
