package a01_intro_04_heranca;

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
		System.out.println("Entre com a unidade de medida dos lados do triângulo X:");
		x.unidadeMedida = sc.next();
		
		// Triâgulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		System.out.println("Entre com a unidade de medida dos lados do triângulo Y:");
		y.unidadeMedida = sc.next();
		
		System.out.println("A área do triângulo X é " + areaX + x.unidadeMedida);
		System.out.println("A área do triângulo Y é " + areaY + y.unidadeMedida);
		
		if (areaX > areaY) {
			System.out.println("Área de X é maior");
		} else {
			System.out.println("Área de Y é maior");
		}
		
		sc.close();
	}

}
