package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De cuántos números quieres hacer la media?");
		
		int size = sc.nextInt();
		
		int[] numeros = new int[size];
		
		System.out.println("Introduzca los numeros");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		double media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			media = media + numeros[i];
		}
		
		System.out.println("La media es: " + media/numeros.length);
	}
}