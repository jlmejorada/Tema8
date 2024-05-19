package ficheros.ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio01 {

	public static void main(String[] args) {
		String linea="";
		String[] cadena;
		double suma = 0;
		double media = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/ficheros.ejercicio01/NumerosReales.txt"));
			try {
				linea = br.readLine();
				cadena = linea.split(" ");
				for( String valor : cadena) {
					suma += Integer.valueOf(valor);
				}
				media = (double) suma / cadena.length;
				
				System.out.println("Suma: " + suma + " " + "Media: " + media);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
