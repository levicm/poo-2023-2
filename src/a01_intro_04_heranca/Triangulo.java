package a01_intro_04_heranca;

public class Triangulo extends Figura {
	
	double a;
	double b;
	double c;
	
	public double area() {
		double p = (a+b+c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
