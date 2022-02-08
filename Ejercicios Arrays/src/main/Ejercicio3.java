package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		System.out.println("Introduzca los numeros");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		double media = 0;
				
		for (int i = 0; i < numeros.length; i++) {
			media = media + numeros[i];
		}
		
		media = media/numeros.length;
		
		System.out.println("La media es: " + media);
		
		double[] notasSuperiores = new double[10];
		int a = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(media < numeros[i]) {
				notasSuperiores[a] = numeros[i];
				System.out.println("Las notas por encima de la media son: " + notasSuperiores[a]);
				a++;
			}
		}
	}
}
