package excercise7;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		
		
		Set<String> sorted = new HashSet<String>();
		
		sorted.add("A");
		sorted.add("F");
		sorted.add("A");
		sorted.add("D");
		sorted.add("F");
		sorted.add("B");
		sorted.addAll(sorted);
		
		System.out.println(sorted);
		
		//System.out.printf("\n====== Unique values using HashSet: %s", sorted);
	}
	
}
		
		