package classExcercises;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class HasMap {

	public static void main(String[] args) {
		Map<String, String> gender = new HashMap<>();
		
		gender.put("Abadi", "Male");
		gender.put("Rahwa", "Female");
		gender.put("Amanuel", "Male");
		gender.put("Nigesti", "Female");
		
		for (Map.Entry person : gender.entrySet()) {
		System.out.println(person.getKey() + ":" +" " + person.getValue());

	//	System.out.println(gender);

		

	}

}}
