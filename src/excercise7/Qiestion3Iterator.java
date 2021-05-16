//b.Remove even elements using iterators.

package excercise7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Qiestion3Iterator {

	public static void main(String[] args) {
List<Integer> myListIterator = new ArrayList<>();
		
		myListIterator.add(1);
		myListIterator.add(2);
		myListIterator.add(4);
		myListIterator.add(4);
		myListIterator.add(5);
		myListIterator.add(5);
		
		Iterator<Integer> it = myListIterator.iterator();

		while (it.hasNext()) {
		    Integer i = it.next();
		    if(i %2 == 0) {
		      it.remove();
		    }}
		      System.out.println(myListIterator);
	}

}

