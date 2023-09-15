package a01_intro_02_com_oo;

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
		double pX = (x.a+x.b+x.c) / 2;
		double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		
		// Triâgulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double pY = (y.a+y.b+y.c) / 2;
		double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
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
