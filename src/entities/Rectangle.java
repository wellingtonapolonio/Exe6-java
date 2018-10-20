package entities;

public class Rectangle {
	private double A;
	private double B;
	
	public Rectangle() {
		
	}

	public Rectangle(double a, double b) {
		A = a;
		B = b;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}
	
	public double area() {
		return A * B;
	}
	
	

}
