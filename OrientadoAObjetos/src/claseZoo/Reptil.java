package claseZoo;

public class Reptil extends Animal {
	private  boolean veneno;
	
	
	public Reptil() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reptil(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
		// TODO Auto-generated constructor stub
	}

	public Reptil(String nombre, String especie, int edad, float peso, float longitud, boolean veneno) {
		super(nombre, especie, edad, peso, longitud);
		this.veneno = veneno;
	}


	public boolean isVeneno() {
		return veneno;
	}

	public void setVeneno(boolean veneno) {
		this.veneno = veneno;
	}


	@Override
	public String toString() {
		return "Reptil [veneno=" + veneno + ", getNombre()=" + getNombre() + ", getEspecie()=" + getEspecie()
				+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Tss Tss Tsss...";
	}

}
