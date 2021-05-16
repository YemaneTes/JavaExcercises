package ExamQuestion7;

public class Student {

	String firstName;
	String lastName;
	int phone;
	double GPA;
	public Student(String firstName, String lastName, int phone, double gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		GPA = gPA;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", GPA=" + GPA + "]";
	}
	
	//public class Instractor dxtends person() {
		
	}
	
	//constructor
	//getters and setters
	//toString method

