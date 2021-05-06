package classExcercises;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		Set<Integer> divisibleRemover = new LinkedHashSet<>();
		
		divisibleRemover.add(1);
		divisibleRemover.add(3);
		divisibleRemover.add(5);
		divisibleRemover.add(7);
		divisibleRemover.add(9);
		divisibleRemover.add(12);
		divisibleRemover.add(14);
		divisibleRemover.add(15);

		
Iterator<Integer> it = divisibleRemover.iterator();

while (it.hasNext()) {
    Integer i = it.next();
    if(i %3 == 0) {
      it.remove();
    }}
      System.out.println(divisibleRemover);
      
/*
 * while (it.hasNext()) { if (it.next()%3 == 0) { it.remove(); } }
 */      

}

}

