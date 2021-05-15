//Write a Java program to test if an array contains a specific value. [4, 6, 7, 9] x=5

package Excercise4;

public class Question2 {

	public static void main(String[] args) {
	   
		int[] num = {4, 6, 7, 9};
	    int theNumber = 5;
	    boolean numAvailable = false;

	    for (int n : num) {
	      if (n == theNumber) {
	    	  numAvailable = true;
	        break;
	      }
	    }
	    
	    if(numAvailable)
	      System.out.println(theNumber + " is available");
	    else
	      System.out.println(theNumber + " is not available.");

	}

}
