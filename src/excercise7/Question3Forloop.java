package excercise7;

import java.util.ArrayList;
import java.util.List;

public class Question3Forloop {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);
		
		for (Integer i : myList) {

			System.out.println(i);
	}

}
	}
