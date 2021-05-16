
//Use while loop and create a program that calculates the average of the numbers between x and y. 
//x and y are the integers the user has to input.

package Excercise3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers and enter -1 to find average :");

        double input = 0;
        double num = 0;
        double sum = 0;
        double avg = 0;
    while (input != -1)
    {
    	input = scan.nextDouble();
        sum += input;
        num++;
    }
    System.out.println("The average is:" + (sum/num));
	}
	
	}
	

	

