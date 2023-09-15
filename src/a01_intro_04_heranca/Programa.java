package a01_intro_04_heranca;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tri�gulo X:
		
		Triangulo x = new Triangulo();
		System.out.println("Entre com os lados do tri�ngulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.area();
		System.out.println("Entre com a unidade de medida dos lados do tri�ngulo X:");
		x.unidadeMedida = sc.next();
		
		// Tri�gulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do tri�ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		System.out.println("Entre com a unidade de medida dos lados do tri�ngulo Y:");
		y.unidadeMedida = sc.next();
		
		System.out.println("A �rea do tri�ngulo X � " + areaX + x.unidadeMedida);
		System.out.println("A �rea do tri�ngulo Y � " + areaY + y.unidadeMedida);
		
		if (areaX > areaY) {
			System.out.println("�rea de X � maior");
		} else {
			System.out.println("�rea de Y � maior");
		}
		
		sc.close();
	}

}
