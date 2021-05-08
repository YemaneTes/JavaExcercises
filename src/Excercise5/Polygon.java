//Day 7 exercises

package Excercise5;

public class Polygon {

	private int sides;
	private String color;

	public Polygon(int sides, String color) {

		this.sides = sides;
		this.color = color;

	}

	public void getSides() {
		System.out.println(this.sides);
	}

	public void getColor() {
		System.out.println(this.color);
	}

}
