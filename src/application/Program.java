package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Quadrado;
import entities.Rectangle;
import entities.Trapezio;
import entities.Triangule;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Triangule t = new Triangule(A, C);
		Quadrado q = new Quadrado(B);
		Rectangle r = new Rectangle(A,B);
		Circle c = new Circle(C);
		Trapezio tr = new Trapezio(A, B, C);
		
		System.out.println("Triagulo = "+ String.format("%.3f", t.area()));
		System.out.println("Quadrado = " + String.format("%.3f", q.area()));
		System.out.println("Retanglo = " + String.format("%.3f", r.area()));
		System.out.println("Circulo = " + String.format("%.3f", c.area()));
		System.out.println("Trapezio = " + String.format("%.3f", tr.area()));
		
		sc.close();
		
		
		
		
	}


}
