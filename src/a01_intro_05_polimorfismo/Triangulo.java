package a01_intro_05_polimorfismo;

public class Triangulo extends Figura {
	
	double a;
	double b;
	double c;
	
	public double area() {
		double p = (a+b+c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
