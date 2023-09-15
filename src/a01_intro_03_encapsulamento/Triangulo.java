package a01_intro_03_encapsulamento;

public class Triangulo {
	
	double a;
	double b;
	double c;
	
	public double area() {
		double p = (a+b+c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
