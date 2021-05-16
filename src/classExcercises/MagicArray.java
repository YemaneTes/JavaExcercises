package classExcercises;

import java.util.ArrayList;

public class MagicArray {
	 public static void main(String[] args) {

		 ArrayList<Integer> division = new ArrayList<Integer>();

		    //Add a set of numbers.
		 division.add(4);
		 division.add(6);
		 division.add(5);
		 division.add(12);
		

		   

		 for (int i : division) {
		 
		        if (i % 3 == 0) {
		        	
		        	
		            System.out.println(i + " Magic Number");
		}else {
			
			
           System.out.println(i + " Not Magic Array");

		}
			
		}}}
	 
