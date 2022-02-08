package main;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		
		
		
		System.out.println("Introduzca los numeros");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			if(numeros[i] == 0) {
				ceros++;
			} else if(numeros[i] > 0) {
				positivos++;
			} else if(numeros[i] < 0) {
				negativos++;
			}
		}
		
		System.out.println("Hay " + positivos + " numeros positivos");
		System.out.println("Hay " + negativos + " numeros negativos");
		System.out.println("Hay " + ceros + " numeros cuyo valor es 0");
	}
}
