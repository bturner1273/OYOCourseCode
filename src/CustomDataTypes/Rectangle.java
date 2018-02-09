package CustomDataTypes;

public class Rectangle extends shape2D {

	private double length, width;

	public Rectangle() {
		super(4);
	}

	public Rectangle(double length, double width) throws InvalidInputException {
		super(4);
		if (length > 0 && width > 0) {
			this.length = length;
			this.width = width;
		} else {
			throw new InvalidInputException("Neither length or width can be negative!");
		}
	}

	public Rectangle(double length) throws InvalidInputException {
		this(length, length);
	}

	public void setWidth(double width) throws InvalidInputException {
		if (width > 0) {
			this.width = width;
		} else {
			throw new InvalidInputException("Width cannot be negative!");
		}
	}

	public void setLength(double length) throws InvalidInputException {
		if (length > 0) {
			this.length = length;
		} else {
			throw new InvalidInputException("Length cannot be negative!");
		}
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {
		super.setPerimeter(2 * width + 2 * length);
		return 2 * width + 2 * length;
	}

	public double getArea() {
		super.setArea(length * width);
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle with Length: " + length + ", Width: " + width + ", Area: " + getArea() + ", Perimeter: "
				+ getPerimeter();
	}

}
