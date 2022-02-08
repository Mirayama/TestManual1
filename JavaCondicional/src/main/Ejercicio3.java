package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		String par; 
		
		System.out.println("Introduzca un numero entero");
	
		A = sc.nextInt() ;
		
		System.out.println("Es " + A + " un numero par? " + (par = (A%2 == 0) ? "Verdadero": "Falso"));

	}

}
