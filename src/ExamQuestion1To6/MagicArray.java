
// question 6

package ExamQuestion1To6;

import java.util.ArrayList;

public class MagicArray {
	 public static void main(String[] args) {

		 ArrayList<Integer> divisionBy3 = new ArrayList<Integer>();

		    //Add a set of numbers.
		 divisionBy3.add(4);
		 divisionBy3.add(6);
		 divisionBy3.add(5);
		 divisionBy3.add(12);
		

		   

		 for (int i : divisionBy3) {
		 
		        if (i % 3 == 0) {
		        	
		        	
		            System.out.println(i + " Magic Number");
		}else {
			
			
           System.out.println(i + " Not Magic Array");

		}
			
		}}}
	 
