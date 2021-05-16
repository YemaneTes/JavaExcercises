//3. Given the list below a.Try to remove the even elements using normal for loop

package excercise7;

import java.util.ArrayList;
import java.util.Iterator;

//import java.util.Collections;
//import java.util.Iterator;

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
	}
		
		public void removeEvenIndex(ArrayList<Integer> myList) {
		      for (int i = 0; i < myList.size() ; i++) {
		          if (i % 2 == 0) {
		        	  myList.remove(i);
		          }
		      }
		      removeEvenIndex(myList);
		      
		      System.out.println(myList);

		  }}


