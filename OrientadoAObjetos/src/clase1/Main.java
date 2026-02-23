package clase1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("titulo1", "autor1", 1900, "asd-123456");
		Libro libro2 = new Libro("titulo2", "autor2", 2007, "asdf-234567");
		Libro libro3 = new Libro("titulo3", "autor4", 2007, "alokjh-87654");
	
		
				
		ArrayList<Libro> listLibros = new ArrayList<Libro> ();
		listLibros.add(libro1);
		listLibros.add(libro2);
		listLibros.add(libro3);
		
		
				
		
		Libreria libreria1 = new Libreria("Libreria Deusto", "Av universidades", "Bilbao", "48007", listLibros);
		System.out.println(libreria1);
				
				
	}

}
