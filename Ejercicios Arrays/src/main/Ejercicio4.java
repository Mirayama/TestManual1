package main;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean repetir = true;
		int[] numeros = new int[20];
		int num = 0;

		System.out.println("Introduzca los numeros");

		for (int i = 0; i < numeros.length; i++) {
			repetir = true;
			while (repetir) {
				num = sc.nextInt();
				if (num % 2 == 0) {
					numeros[i] = num;
					repetir = false;
				} else {
					System.out.println("Introduzca un numero par");
				}
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El numero guardado en la posicion " + i + " es " + numeros[i]);
		}
	}
}
