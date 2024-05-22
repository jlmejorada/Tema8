package ficheros.ejercicios07.errores;

public class OpcionNoValida extends Exception{

	@Override
	public String toString() {
		return "Error, opción no valida";
	}
}
