
public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// default constructor
	// protected - can only be used inside of package
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// Construct a geometric object with color and filled value
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	// TODO - create abstract method getArea 
	abstract public double getArea();
	// TODO - create abstract method getPerimeter
	abstract public double getPerimeter();
	
}
