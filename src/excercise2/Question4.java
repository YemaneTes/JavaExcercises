package excercise2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your age");
		
		age = scanner.nextInt();
		
		
		if(age>=18)
		System.out.println("Eligible to vote");
		else
		System.out.println("Not Eligible to vote");

	}

}

