package excepciones.ejercicioHora;

import excepciones.ejercicio02.NegativeHourException;
import excepciones.ejercicio02.NegativeMinuteException;

public class Main {

	public static void main(String[] args) {
		int hora=5;
		 
		int minuto=-55;
		
		int segundo=59;
		
		Hora hr;
		
			try {
				hr = new Hora(hora, minuto);
				hr.inc();	
				System.out.println(hr);
			} catch (NegativeHourException | NegativeMinuteException e) {
				System.out.println(e);
			}		
		
		

		
		/*HoraExacta he = new HoraExacta(hora, minuto, segundo);
		
		he.inc();*/
		
		//System.out.println(he);
	}

}
