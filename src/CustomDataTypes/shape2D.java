package CustomDataTypes;

public class shape2D implements Comparable<shape2D>{
	private double area;
	private double perimeter;
	private int numSides;
	public shape2D() {}
	public shape2D(int numSides, double area, double perimeter){
		this.numSides = numSides;
		this.area = area;
		this.perimeter = perimeter;
	}
	public shape2D(int numSides){
		this.numSides = numSides;
	}
	public double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getNumSides() {
		return numSides;
	}
	protected void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	@Override
	public String toString(){
		return this.getArea()+"";
	}
	@Override
	public int compareTo(shape2D o) {
		if(this.getArea() == o.getArea()){
			return 0;
		}else if(this.getArea() > o.getArea()){
			return 1;
		}else{
			return -1;
		}
	}
}
