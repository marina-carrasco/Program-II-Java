package clase1;

import java.util.ArrayList;

public class Libreria {
	
	private String nombre;
	private String calle;
	private String localidad;
	private String cp;
	private ArrayList<Libro> listaLibros;
	
	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libreria(String nombre, String calle, String localidad, String cp, ArrayList<Libro> listaLibros) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.localidad = localidad;
		this.cp = cp;
		this.listaLibros = listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", calle=" + calle + ", localidad=" + localidad + ", cp=" + cp
				+ ", listaLibros=" + listaLibros + "]";
	}

	
	
	
	
	

}
