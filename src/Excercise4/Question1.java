package Excercise4;

public class Question1 {

	public static void main(String[] args) {
	       int[] integers = new int[]{4, 6, 7, 9,};

	       int sum = 0;
	       for(int i=0; i < integers.length ; i++)
	        sum = sum + integers[i];

	       double avg = sum / integers.length;
	        System.out.println("The average value of the array integers is : " + avg);

	}

}
