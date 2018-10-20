package entities;

public class Circle {
	private double C;
	
	public Circle() {
		
	}

	public Circle(double c) {
	
		C = c;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}
	
	public double area() {
		return Math.PI * C * C;
	}
	
	

}

