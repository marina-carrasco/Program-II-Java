package claseZoo;

public class Mamifero extends Animal {
	private int crias;


	public Mamifero(String nombre, String especie, int edad, float peso, float longitud, int crias) {
		super(nombre, especie, edad, peso, longitud);
		this.crias = crias;
	}

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String nombre, String especie, int edad, float peso, float longitud) {
		super(nombre, especie, edad, peso, longitud);
		// TODO Auto-generated constructor stub
	}


	public int getCrias() {
		return crias;
	}

	public void setCrias(int crias) {
		this.crias = crias;
	}
	

	@Override
	public String toString() {
		return "Mamifero [crias=" + crias + ", getNombre()=" + getNombre() + ", getEspecie()=" + getEspecie()
				+ ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Guau guau guau";
	}

}
