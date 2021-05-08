//Write a Java program to check if an input string starts with “T”. If it start with “T” print “Yes that is the string”, otherwise print “That is not the one”

package excercise2;

public class Question2 {

	public static void main(String[] args) {
		
		String mystring = "Tom is going to the store";  
			
	if (mystring.startsWith("T")) {
		System.out.println(mystring.startsWith("T") +":"+ "Yes that is the string");  
		
	}else {
			
		System.out.println("That is not the one");

	}

}
}