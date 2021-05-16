package ExamQuestion1To6;

import java.util.Scanner;

public class PhoneNoumberValidation {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter your the number: ");
	      String phone = scanner.next();
	      
	      String numbers = "\\d{10}";
	      
	      boolean result = phone.matches(numbers);
	      if(result) {
	         System.out.println("valid Phone Number");
	      } else {
	         System.out.println("Invalid Phone Number");
	      }
	   }
	}

