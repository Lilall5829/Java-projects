public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		//TODO - include call to super constructor
		super("Red", true);
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
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double getPerimeter() {
		
		return 0;
	}

}