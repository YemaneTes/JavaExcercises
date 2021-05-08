
//Write a Java program to copy an array by iterating the array. Arr1 [3, 4,5,2] Arr2 [null, null, null, null]

package Excercise4;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {

		int[] array1 = { 3, 4, 5, 2 };
		int[] arrayCopy = new int[4];

		System.out.println("The original Array : " + Arrays.toString(array1));

		for (int i = 0; i < array1.length; i++) {
			arrayCopy[i] = array1[i];
		}
		System.out.println("the copied Array: " + Arrays.toString(arrayCopy));

	}

}
