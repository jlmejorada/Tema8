package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int entero=0;
		
		double decimal=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero decimal");
		decimal=readDouble(sc);
		
		
		System.out.println("Dame un numero entero");
		entero=readInt(sc);
		
		if (decimal==0.0) {
			System.out.println("Tafeo");
		} else System.out.println("Taway");
		
		if (entero==0) {
			System.out.println("Tafeo");
		} else System.out.println("Taway");
		
		sc.close();
	}
	
	static double readDouble(Scanner sc) {
		double res=0.0;
		try {
			res = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo Double");
		} finally {
			sc.nextLine();
		}
		return res;
	}

	static int readInt(Scanner sc) {
		int res=0;
		try {
			res = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo Int");
		} finally {
			sc.nextLine();
		}
		return res;
	}
}
