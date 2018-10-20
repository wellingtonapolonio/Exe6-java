package entities;

public class Quadrado {
	private double B;
	
	public Quadrado() {
		
	}

	public Quadrado(double b) {
		
		B = b;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}
	
	public double area() {
		return B*B;
	}
	
	

}
