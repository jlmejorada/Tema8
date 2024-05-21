package excepciones.ejercicio02;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		
		return "Error, minutos negativos";
	}
}
