package ficheros.ejercicios07.errores;

public class TipoIncorrecto extends Exception{

	@Override
	public String toString() {
		return "El tipo introducido no es correcto";
	}

}
