//Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. 
//A person who is eligible to vote must be older than or equal to 18 years old

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

