package Excercise3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		int i;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = scanner.nextInt();
		System.out.print("\n");
		i = 1;
		do {
			if (i % 2 == 0) {
				System.out.print(i + "\n");
			}
			i++;
		} while (i <= num);

	}

}
