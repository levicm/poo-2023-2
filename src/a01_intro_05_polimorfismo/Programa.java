package a01_intro_05_polimorfismo;

import java.util.Iterator;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Triâgulo X:
		
		Triangulo x = new Triangulo();
		System.out.println("Entre com os lados do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com a unidade de medida dos lados do triângulo X:");
		x.unidadeMedida = sc.next();
		
		// Triâgulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		System.out.println("Entre com a unidade de medida dos lados do triângulo Y:");
		y.unidadeMedida = sc.next();
		
		Retangulo retangulo = new Retangulo();
		retangulo.a = 10;
		retangulo.b = 20;
		retangulo.unidadeMedida = "nm";
		
		Circulo circulo =  new Circulo();
		circulo.raio = 12;
		circulo.unidadeMedida = "mm";
		
		Figura[] figuras = new Figura[] {x, y, retangulo, circulo};
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].area() + " " + figuras[i].unidadeMedida);
		}
		
		sc.close();
	}

}
