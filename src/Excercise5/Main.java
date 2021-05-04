package Excercise5;

public class Main {

	public static void main(String[] args) {

		Polygon triangle = new Polygon(3, "Black");
		Polygon rectangle = new Polygon(4, "Red");
		Polygon polygon = new Polygon(8, "White");

		triangle.getSides();
		triangle.getColor();

		rectangle.getSides();
		rectangle.getColor();

		polygon.getSides();
		polygon.getColor();

		ThreeDimantionalShape rectangular3D = new ThreeDimantionalShape(3, "Blue", 8);
		rectangular3D.getSides();
		rectangular3D.getColor();
		rectangular3D.theHight();

	}

}
