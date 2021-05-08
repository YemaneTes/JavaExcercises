//Write a Java program which reads two integers from the user and prints the sum and difference both in their own line.

package excercise2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	    System.out.print("Input the first number: ");
	    
	    int num1 = input.nextInt();
	    System.out.print("Input the second number: ");
	    
	    int num2 = input.nextInt();
	    
	    int sum = num1 + num2;
	   // System.out.println();
	    System.out.println("Sum: "+sum);
	    
	    int difference = num1 - num2;
	    
	   // System.out.println();
	    System.out.println("Difference: "+difference);
	}

}
