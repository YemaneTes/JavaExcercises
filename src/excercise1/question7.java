
//7. Write a Java program to print the area and perimeter of a circle. Test Data:

package excercise1;

public class question7 {

		   
		private static double radius = 7.5;

		    public static void main(String[] args) {

		        double perimeter = 2 * Math.PI * radius;
		        double area = Math.PI * radius * radius;

		        System.out.println("Perimeter is = " + perimeter);
		        System.out.println("Area is = " + area);

	}

}
