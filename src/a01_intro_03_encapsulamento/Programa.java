package a01_intro_03_encapsulamento;

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
		double areaX = x.area();
		
		// Triâgulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		
		System.out.println("A área do triângulo X é " + areaX);
		System.out.println("A área do triângulo Y é " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Área de X é maior");
		} else {
			System.out.println("Área de Y é maior");
		}
		
		sc.close();
	}

}
