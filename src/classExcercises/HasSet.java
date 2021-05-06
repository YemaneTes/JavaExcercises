package classExcercises;

import java.util.HashSet;
//import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HasSet {

	public static void main(String[] args) {
		Set<String> weekDays = new HashSet<>();

		weekDays.add("Monday");
		weekDays.add("Tusday");
		weekDays.add("Wednsday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		weekDays.add("Saturday");
		weekDays.add("Sunday");

		System.out.println(weekDays.size());
		
		weekDays.remove("Friday");
		
		boolean a = weekDays.contains("Friday");
		System.out.println(a);
		
		for (String i : weekDays) {

			System.out.println(i);

			
			
		}

	}

}
