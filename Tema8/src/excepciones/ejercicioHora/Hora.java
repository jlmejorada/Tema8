package excepciones.ejercicioHora;

import excepciones.ejercicio02.NegativeHourException;
import excepciones.ejercicio02.NegativeMinuteException;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) throws NegativeHourException,  NegativeMinuteException {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}else {
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
	
	boolean setMinutos(int valor) {
		boolean asignar=false;
		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			asignar=true;
		}
		return asignar;
	}
	
	boolean setHoras(int valor) {
		boolean asignar=false;
		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			asignar=true;
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
