package Excercise5;

public class ThreeDimantionalShape extends Polygon {
	private int height;

	public ThreeDimantionalShape(int sides, String color, int height) {
		super(sides, color);
		this.height = height;

	}

	public void theHight() {
		System.out.println(this.height);
	}
}
