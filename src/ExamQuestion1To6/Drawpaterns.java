package ExamQuestion1To6;

import java.util.Scanner;

public class Drawpaterns {

	
	    public static void printStars(int n)
	    {
	        int a, b;
	 
	        Scanner scanner = new Scanner(System.in);

	        for(a=0; a<n; a++)
	        {
	 
	          
	            for(b=0; b<=a; b++)
	            {
	             
	                System.out.print("* ");
	            }
	 
	         
	            System.out.println();
	        }
	   }
	 
	    public static void main(String args[])
	    {
	        int n = 5;
	        printStars(n);
	    }
	}