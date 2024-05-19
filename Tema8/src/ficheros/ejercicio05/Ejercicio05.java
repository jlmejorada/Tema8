package ficheros.ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedWriter in = null;
		String nombre;
		int edad;

		try {
			 in = new BufferedWriter(new FileWriter("C:\\Users\\mamej\\git\\Tema8\\Tema8\\src\\ficheros\\ejercicio04\\alumnos.txt", true));
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			in.write(nombre);
			in.write("::");
			System.out.println("Edad: ");
			edad = sc.nextInt();
			sc.nextLine();
			in.write(Integer.toString(edad));
			in.newLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.flush();
				in.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
