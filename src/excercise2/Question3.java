package excercise2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int input = scanner.nextInt();

		if (input > 0) 
			
		{
			System.out.println("It is positive number");
			
		} else if (input < 0) {
			System.out.println("It is Negative number");
		} else {
			System.out.println("It is zero");
		}
	}

}

