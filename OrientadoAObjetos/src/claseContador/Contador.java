package claseContador;

import java.util.Arrays;

public class Contador {
	
	private int[] enteros;

	public Contador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contador(int[] enteros) {
		super();
		this.enteros = enteros;
	}

	public int[] getEnteros() {
		return enteros;
	}

	public void setEnteros(int[] enteros) {
		this.enteros = enteros;
	}

	@Override
	public String toString() {
		return "Contador [enteros=" + Arrays.toString(enteros) + "]";
	}
	


	
	public void incrementar () {
		for (int i =0;i<enteros.length;i++) {
			enteros[i] = enteros[i] + 1;	
		}
	}
	
	public void decrementar () {
		for (int i =0;i<enteros.length;i++) {
			enteros[i] = enteros[i] - 1;	
		}
	}
	

	
	

	
	

}
