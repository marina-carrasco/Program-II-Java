package claseZoo;

public class Ave extends Animal {
	private float tamaño;
	private String color;

	public Ave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ave(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
		// TODO Auto-generated constructor stub
	}


	public Ave(String nombre, String especie, int edad, float peso, float longitud, float tamaño, String color) {
		super(nombre, especie, edad, peso, longitud);
		this.tamaño = tamaño;
		this.color = color;
	}
	

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Ave [tamaño=" + tamaño + ", getNombre()=" + getNombre() + ", getEspecie()=" + getEspecie()
				+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getLongitud()=" + getLongitud() + "]";
	}

	
	
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Pio pio pio";
	}

}
