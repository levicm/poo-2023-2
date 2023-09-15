package a01_intro_01_sem_oo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Tri�gulo X:
		double xA, xB, xC;
		System.out.println("Entre com os lados do tri�ngulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		double pX = (xA+xB+xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		// Tri�gulo Y:
		double yA, yB, yC;
		System.out.println("Entre com os lados do tri�ngulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		double pY = (yA+yB+yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
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







