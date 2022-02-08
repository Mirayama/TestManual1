package main;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Introduzca los numeros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		double media = 0;	
		for (int i = 0; i < numeros.length; i++) {
			if(i % 2 == 0 && i != 0) {
				media = media + numeros[i];
			}
		}
		System.out.println("La media es: " + media/numeros.length);
	}
}