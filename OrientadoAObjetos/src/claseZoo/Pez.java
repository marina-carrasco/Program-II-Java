package claseZoo;

public class Pez extends Animal {
	private float velocidad;
	private boolean aguaDulce;
		

	public Pez() {
			super();
			// TODO Auto-generated constructor stub
		}

	public Pez(String nombre, String especie, int edad, float peso, float longitud) {
			super(nombre, especie, edad, peso, longitud);
			// TODO Auto-generated constructor stub
		}


	public Pez(String nombre, String especie, int edad, float peso, float longitud, float velocidad,
				boolean aguaDulce) {
			super(nombre, especie, edad, peso, longitud);
			this.velocidad = velocidad;
			this.aguaDulce = aguaDulce;
		}
	
	
	
	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isAguaDulce() {
		return aguaDulce;
	}

	public void setAguaDulce(boolean aguaDulce) {
		this.aguaDulce = aguaDulce;
	}
	
	

	@Override
	public String toString() {
		return "Pez [velocidad=" + velocidad + ", aguaDulce=" + aguaDulce + ", getNombre()=" + getNombre()
				+ ", getEspecie()=" + getEspecie() + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso()
				+ ", getLongitud()=" + getLongitud() + "]";
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Glug glug glug glug...";
	}

}
