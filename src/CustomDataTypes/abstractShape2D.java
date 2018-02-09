package CustomDataTypes;

public abstract class abstractShape2D {
	private int numSides;
	public abstractShape2D() {}
	public abstractShape2D(int numSides, double area, double perimeter){
		this.numSides = numSides;
	}
	public abstractShape2D(int numSides){
		this.numSides = numSides;
	}
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public abstract void setArea(double area) throws InvalidInputException;
	public abstract void setPerimeter(double perimeter) throws InvalidInputException;
	public abstract double getArea();
	public abstract double getPerimeter();
}
