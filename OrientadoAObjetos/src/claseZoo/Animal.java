package claseZoo;

public abstract class Animal {
	private String nombre;
	private String especie;
	private int edad;
	private float peso;
	private float longitud;
	
	public Animal(String nombre, String especie, int edad, float peso, float longitud) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.peso = peso;
		this.longitud = longitud;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", peso=" + peso + ", longitud="
				+ longitud + "]";
	}
	
	
	public abstract String sonido();
	
	
	

}
