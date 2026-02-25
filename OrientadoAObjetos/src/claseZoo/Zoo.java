package claseZoo;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animal;

	public Zoo(ArrayList<Animal> animal) {
		super();
		this.animal = animal;
	}

	public Zoo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(ArrayList<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Zoo [animal=" + animal + "]";
	}
	
	
	
	public int cantidadMamiferos() {
		int cantidad = 0;
		for (int i = 0; i < animal.size(); i++) {
			if (animal.get(i) instanceof Mamifero)
				cantidad++;	
		}
		return cantidad;
	}
	
	public ArrayList<Reptil> listaReptiles() {
		ArrayList<Reptil> lista = new ArrayList<Reptil>();
		for (int i = 0; i < animal.size(); i++) {
			if(animal.get(i) instanceof Reptil) 
				lista.add((Reptil)animal.get(i));
		}
		return lista;
		
	}
	
	public float pesoPromedio() {
		float contador = 0.0f;
		float pesospromedio = 0.0f;
		for (int i = 0; i < animal.size(); i++) {
			contador = contador + animal.get(i).getPeso();
		}
		pesospromedio = contador/animal.size();
		return pesospromedio;
	}
	
	public int totalCrias() {
		int contador = 0;
		for (int i = 0; i < animal.size(); i++) {
			if(animal.get(i) instanceof Mamifero)
				contador = contador + ((Mamifero)animal.get(i)).getCrias();
		}
		return contador;
	}
	
	
	// implementa una funcion que devuelva cuantos reptiles venenosos hay en el zoo
	
	
}
