package ExamQuestion7;

public class Instractor {

	String firstName;
	String lastName;
	int phone;
	double grossSalary;
	public Instractor(String firstName, String lastName, int phone, double grossSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.grossSalary = grossSalary;
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
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	@Override
	public String toString() {
		return "Instractor [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", grossSalary="
				+ grossSalary + "]";
	}
	
	
	//constructor
	//getters and setters
	//toString method
	//calculateNetSalary - this method takes gross salary and
	/*
	 * returns net salary assuming tax as 20%. Create main class
	 * CollectionApplication Create 1 student object and 1 instructor object and
	 * print it.
	 */
}
