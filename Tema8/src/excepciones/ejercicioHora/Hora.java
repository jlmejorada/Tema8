package excepciones.ejercicioHora;

import excepciones.ejercicio02.NegativeHourException;
import excepciones.ejercicio02.NegativeMinuteException;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException{
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else if (hora<0) {
			throw new NegativeHourException();
		}
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		} else if (minuto<0) {
			throw new NegativeMinuteException();
		}
	}
	
	void inc() {
		minuto++;
		if (minuto==60) {
			minuto=0;
			hora++;
		}
		if (hora==24) {
			hora=0;
		}
	}
	
	boolean setMinutos(int valor) throws NegativeMinuteException {
		boolean asignar=false;
		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			asignar=true;
		} else if(valor<0) {
			throw new NegativeMinuteException();
		}
		return asignar;
	}
	
	boolean setHoras(int valor) throws NegativeHourException {
		boolean asignar=false;
		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			asignar=true;
		} else if(valor<0) {
			throw new NegativeHourException();
		}
		return asignar;
	}
	
	@Override
	public String toString() {
		String mostrar="";
		
		if (hora<10) {
			mostrar += "0" + this.hora + ":";
		} else mostrar += this.hora + ":";
		
		if (minuto<10) {
			mostrar += "0" + this.minuto;
		} else mostrar += this.minuto;		
		
		return mostrar;
	}
	
	
}
