package main;

import java.util.Scanner;

public class Ejercicio4 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		String respuesta; 
		
		System.out.println("Introduzca un numero entero");
	
		A = sc.nextInt() ;
		
		System.out.println(A + (respuesta = (A < 0) ? " es negativo": " es positivo"));
		System.out.println(A + (respuesta = (A%2 == 0) ? " es verdadero": " es also"));
		System.out.println(A + (respuesta = (A%5 == 0) ? " es multiplo de 5": " no es multiplo de 5"));
		System.out.println(A + (respuesta = (A%10 == 0) ? " es multiplo de 10": " no es multiplo de 10"));
		System.out.println(A + (respuesta = (A < 100) ? " es menor que 100": " es mayor que 100"));
	}
}
