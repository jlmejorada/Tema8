package ficheros.ejercicios07;

import java.util.Scanner;

import ficheros.ejercicios07.errores.OpcionNoValida;
import ficheros.ejercicios07.errores.TipoIncorrecto;

public class Ejercicios07 {

	public static void main(String[] args) throws OpcionNoValida, TipoIncorrecto{
		int opc=0;
		Scanner sc = new Scanner(System.in);
		muestraMenu();
		try {
			System.out.println("Elige una opción:");
			opc=sc.nextInt();
		} catch (Exception e) {
			//System.out.println(TipoIncorrecto);
		}
		do {
			switch (opc) {
			case 1 ->{
				
			}
			case 2 ->{
						
					}
			case 3 ->{
				
			}
			case 4 ->{
				System.out.println("Saliendo...");
			}
			default->{
				throw new OpcionNoValida();
				//System.err.println(OpcionNoValida());
			}
			}
			muestraMenu();
			try {
				System.out.println("Elige una opción:");
				opc=sc.nextInt();
			} catch (Exception e) {
				//System.out.println(TipoIncorrecto);
			}
		} while (opc!=4);
	}
	
	public static void muestraMenu() {
		System.out.println("----------------------");
		System.out.println("---------Menu---------");
		System.out.println("----------------------");
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar por nombre");
		System.out.println("3. Mostrar todos");
		System.out.println("4. Salir");
		System.out.println("----------------------");
	}

}
