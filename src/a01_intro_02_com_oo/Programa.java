package a01_intro_02_com_oo;

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
		double pX = (x.a+x.b+x.c) / 2;
		double areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		
		// Tri�gulo Y:
		Triangulo y = new Triangulo();
		System.out.println("Entre com os lados do tri�ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double pY = (y.a+y.b+y.c) / 2;
		double areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		System.out.println("A �rea do tri�ngulo X � " + areaX);
		System.out.println("A �rea do tri�ngulo Y � " + areaY);
		
		if (areaX > areaY) {
			System.out.println("�rea de X � maior");
		} else {
			System.out.println("�rea de Y � maior");
		}
		
		sc.close();
	}

}
