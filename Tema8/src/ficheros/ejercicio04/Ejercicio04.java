package ficheros.ejercicio04;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final String FINAL = "fin";
		String palabra = "";
		
		BufferedWriter tx = null;
		
		try {
			tx = new BufferedWriter(new FileWriter("C:\\Users\\mamej\\git\\Tema8\\Tema8\\src\\ficheros\\ejercicio04\\texto.txt"));
			while(!palabra.equals(FINAL)) {
				System.out.println("Palabra: ");
				palabra = sc.nextLine();
				tx.write(palabra + " ");
			}
			
		}catch(FileNotFoundException e) {
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				tx.flush();
				tx.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
