package entities;

public class Trapezio {
	private double A;
	private double B;
	private double C;
	
	public Trapezio() {
		
	}

	public Trapezio(double a, double b, double c) {
		A = a;
		B = b;
		C = c;
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

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}
	
	public double area() {
		return A + B / 2.0 * C;
	}
	

}
