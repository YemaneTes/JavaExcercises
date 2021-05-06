package classExcercises;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashTree {

	public static void main(String[] args) {
		Set<String> weekDays = new TreeSet<>();

		weekDays.add("Monday");
		weekDays.add("Tusday");
		weekDays.add("Wednsday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		weekDays.add("Saturday");
		weekDays.add("Sunday");

		for (String i : weekDays) {

			System.out.println(i);
		}
	}
}