package a01_intro_05_polimorfismo;

public class Circulo extends Figura {

	double PI = 3.14;
	double raio;

	public double area() {
		return PI * raio * raio;
	}

}
