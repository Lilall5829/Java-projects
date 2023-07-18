public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		//TODO - include call to super constructor
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}

	@Override 
	public String toString() {
		return super.toString() + " radius: " + radius;
	}
	
	//TODO - Override getArea()
	
	//TODO - Override getPerimeter()
}