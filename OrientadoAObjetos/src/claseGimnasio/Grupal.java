package claseGimnasio;

public class Grupal {
	private String nombre;
	private Entrenadores entrenadorPersonal;
	private int capacidad;
	private Categoria categoria;
	
	public Grupal(String nombre, Entrenadores entrenadorPersonal, int capacidad, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.entrenadorPersonal = entrenadorPersonal;
		this.capacidad = capacidad;
		this.categoria = categoria;
	}
	
	public Grupal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Entrenadores getEntrenadorPersonal() {
		return entrenadorPersonal;
	}
	public void setEntrenadorPersonal(Entrenadores entrenadorPersonal) {
		this.entrenadorPersonal = entrenadorPersonal;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Grupal [nombre=" + nombre + ", entrenadorPersonal=" + entrenadorPersonal + ", capacidad=" + capacidad
				+ ", categoria=" + categoria + "]";
	}
	
	
	
	
	
	

}
