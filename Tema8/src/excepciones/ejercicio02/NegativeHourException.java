package excepciones.ejercicio02;

public class NegativeHourException extends Exception{

	@Override
	public String toString() {
		
		return "Error, horas negativas";
	}
}
