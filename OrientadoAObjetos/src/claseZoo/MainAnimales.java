package claseZoo;

import java.util.ArrayList;

public class MainAnimales {

	public static void main(String[] args) {
		
		
		// la lista mejor llamarla listaAnimales
		Animal mamifero1 = new Mamifero("Pintxo", "perro", 5, 10, 100, 3);
		Mamifero mamifero2 = new Mamifero("Bambi", "gato", 3, 15, 50, 1);
		Mamifero mamifero3 = new Mamifero("Luna", "delfin", 8, 25, 200, 2);
		Mamifero mamifero4 = new Mamifero("Rocky", "oso", 12, 80, 300, 4);
		
		
		
		Animal pez1 = new Pez("Nemo", "pez payaso", 1, 1, 10, 10, false);
		Pez pez2 = new Pez("Dori", "pez cirujano", 1, 1, 10, 10, false);
		
		Animal reptil1 = new Reptil("Picoso", "cobra", 2, 3, 2, true);
		Reptil reptil2 = new Reptil("Pepe", "tortuga", 1, 1, 1, false);
		Reptil reptil3 = new Reptil("Rayo", "lagarto", 4, 2, 1, true);
		
		Animal ave1 = new Ave("Rio", "guacamayo", 2, 3, 1, 10, "rojo");
		Ave ave2 = new Ave("Juan", "periquito", 2, 1, 5, 2, "azul");
		Ave ave3 = new Ave("Sky", "águila", 5, 4, 2, 20, "marron");
		Ave ave4 = new Ave("Nube", "paloma", 3, 2, 1, 5, "gris");
		Ave ave5 = new Ave("Fenix", "canario", 1, 1, 3, 1, "amarillo");
		
		System.out.println(mamifero1.toString());
		System.out.println(mamifero2.toString());
		System.out.println(mamifero3.toString());
		System.out.println(mamifero4.toString());
		System.out.println(pez1.toString());
		System.out.println(pez2.toString());
		System.out.println(reptil1.toString());
		System.out.println(reptil2.toString());
		System.out.println(reptil3.toString());
		System.out.println(ave1.toString());
		System.out.println(ave2.toString());
		System.out.println(ave3.toString());
		System.out.println(ave4.toString());
		System.out.println(ave5.toString());
		
		
		
		Zoo zoo = new Zoo();
		ArrayList<Animal> animal = new ArrayList<Animal>();
		animal.add(mamifero1);
		animal.add(mamifero2);
		animal.add(mamifero3);
		animal.add(mamifero4);
		
		animal.add(pez1);
		animal.add(pez2);
		
		animal.add(reptil1);
		animal.add(reptil2);
		animal.add(reptil3);
		
		animal.add(ave1);
		animal.add(ave2);
		animal.add(ave3);
		animal.add(ave4);
		animal.add(ave5);

		
		
		zoo.setAnimal(animal);
		
		System.out.println(zoo.toString());
		
		// int cantidadMamiferos = zoo.cantidadMamiferos;
		System.out.println(zoo.cantidadMamiferos());
		
		System.out.println(mamifero1.sonido());
		
		
		System.out.println(zoo.listaReptiles());
		
		System.out.println(zoo.pesoPromedio());
		
		System.out.println(zoo.totalCrias());
		

	}

}
