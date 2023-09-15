package a01_intro_01_sem_oo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Triâgulo X:
		double xA, xB, xC;
		System.out.println("Entre com os lados do triângulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		double pX = (xA+xB+xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		// Triâgulo Y:
		double yA, yB, yC;
		System.out.println("Entre com os lados do triângulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		double pY = (yA+yB+yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
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







