
//1.Write a Java program to concatenate a given string to the end of another string.

package excercise2;

public class Question1 {

	public static void main(String[] args) {
		String myString1 = " The First String / ";
		String mystring2 = "The Second String";

		//System.out.println("first String: " + myString1);
		//System.out.println("Socond String: " + mystring2);

		// ============check

		String MyString3 = myString1.concat(mystring2);

		System.out.println("Concatenated string is: " + MyString3);

	}

}
