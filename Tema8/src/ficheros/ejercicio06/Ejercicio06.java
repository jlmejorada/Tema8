package ficheros.ejercicio06;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		ArrayList <Integer> numeritos = new ArrayList<>();
		BufferedWriter in = null;
		try {
			Scanner sc = new Scanner(new FileReader("C:\\Users\\mamej\\git\\Tema8\\Tema8\\src\\ficheros\\ejercicio06\\SinOrdenar.txt"));
			in = new BufferedWriter(new FileWriter("C:\\Users\\mamej\\git\\Tema8\\Tema8\\src\\ficheros\\ejercicio06\\Ordenado.txt"));
			
			while(sc.hasNextInt()) {
				
				numeritos.add(sc.nextInt());
				
			}
			
			System.out.println(numeritos);
			Collections.sort(numeritos);
			
			for(int valor : numeritos) {
				in.write(Integer.toString(valor));
				in.newLine();
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
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
