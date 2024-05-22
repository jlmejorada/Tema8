package ficheros.ejercicios07;

public class Contacto implements Comparable<Contacto>{

	private String nombre;

	private int numero;


	public Contacto(String nombre, int numero) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (numero > 0) {
			this.numero = numero;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}
	
	@Override
	public String toString() {
		String cadena="";
		cadena += "----------------------------------\n"; 
		cadena = this.nombre + "::" + this.numero ;
		
		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		Contacto c = (Contacto) obj;
		if (this.nombre.equals(c.nombre)) {
			esIgual=true;
		}
		return esIgual;
	}
	

	public int compareTo(Contacto c) {
		int pos=0;
		if (this.nombre.compareTo(c.nombre) > 0) {
			pos = 1;
		} else if (this.nombre.compareTo(c.nombre) < 0) {
			pos = -1;
		}
		return pos;
	}

}
