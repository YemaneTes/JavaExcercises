package Excercise3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers and enter -1 to find average :");

        double inpit = 0;
        double num = 0;
        double sum = 0;
        double avg = 0;
    while (inpit != -1)
    {
    	inpit = scan.nextDouble();
        sum += inpit;
        num++;
    }
    System.out.println("The average is:" + (sum/num));
	}
	
	}
	

	

