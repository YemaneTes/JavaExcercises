package ExamQuestion1To6;

public class SalaryCalculator {

	 static String name = "John Doe";
	String city_and_state = "Charlotte NC";
	static double grossSalary = 100000;
	static double tax = 0.2;
	double netSalary;
	

	public static void main(String[] args) {
	
	System.out.println("Hello my name is John Doe" + name + "I live in Charlotte NC" + "my gross salary is" +"$" + grossSalary + "I pay" + 
	(tax * grossSalary) + "in tax and I take home " + (grossSalary - (grossSalary*tax )));
	
}
}