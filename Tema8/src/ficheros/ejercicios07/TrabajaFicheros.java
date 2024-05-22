package ficheros.ejercicios07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TrabajaFicheros {
	
	String direccion="Tema8/src/ficheros/ejercicios07/agenda/misDatos.txt";
	
	public void escribeFicheros() {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter (new FileWriter(direccion));
		} catch (IOException e) {
			System.out.println("Error al enlazar el archivo"); 
		}
	}

}
