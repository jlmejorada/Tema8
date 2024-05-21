package excepciones.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numInt=0;
		double numDouble=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero int");
		numInt=readInt(sc);
		System.out.println(numInt);
		System.out.println("Dame un numero double");
		numDouble=readDouble(sc);
		System.out.println(numDouble);
	}

	public static int readInt(Scanner sc) {
		int num=0;
		try {
			num=sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El numero introducido debe ser tipo int");
		} finally {
			sc.nextLine();
		}
		return num;
	}
	
	public static double readDouble(Scanner sc) {
		double num=0.0;
		try {
			num=sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El numero introducido debe ser tipo double");
		} finally {
			sc.nextLine();
		}
		return num;
	}
	
}
