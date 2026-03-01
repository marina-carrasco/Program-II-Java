package claseGimnasio;

import java.util.ArrayList;

public class MainGimnasio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuarios miembroRegular1 = new MiembrosRegulares("Pepe", "Calle Canarias", "+34 3245678678", "hola@gmail.com", 19, "Membresia Premium");
		Usuarios miembroRegular2 = new MiembrosRegulares("Marina", "Avenida del Puerto", "+34 600123456", "marina@gmail.com", 25, "Membresia Básica");
		Usuarios miembroRegular3 = new MiembrosRegulares("Manolo", "Calle Mayor 10", "+34 611987654", "manolo_gym@hotmail.com", 42, "Membresia Premium");
		Usuarios miembroRegular4 = new MiembrosRegulares("Lucía", "Plaza de España", "+34 622334455", "lucia.fit@yahoo.com", 31, "Membresia Fin de Semana");
		Usuarios miembroRegular5 = new MiembrosRegulares("Carlos", "Calle de la Luna", "+34 655443322", "carlitos99@gmail.com", 20, "Membresia Básica");
		
		
		Usuarios entrenador1 = new Entrenadores("Rosa", "Calle Fueros", "+34 689542968", "rosa@gmail.com", "Certificación C", "Yoga");
		Usuarios entrenador2 = new Entrenadores("Javier", "Calle Mayor 5", "+34 677889900", "javier.fit@gmail.com", "Certificación Nacional A", "Fit Boxing");
		Usuarios entrenador3 = new Entrenadores("Elena", "Avenida Libertad", "+34 655443322", "elena.pilates@outlook.es", "Máster en Pilates", "Pilates");
		Usuarios entrenador4 = new Entrenadores("Roberto", "Calle Nueva 12", "+34 622110099", "rob_entrenador@hotmail.com", "Certificación Crossfit", "Entrenamiento");
		Usuarios entrenador5 = new Entrenadores("Sofía", "Plaza Circular", "+34 600900800", "sofia.yoga@gmail.com", "Yoga Alliance 500h", "Yoga");
		

		Usuarios admin1 = new PersonalAdministracion("Marta", "Calle Central 1", "+34 600000001", "marta.recepcion@gym.com", "Recepcionista", 8);
		Usuarios admin2 = new PersonalAdministracion("Ricardo", "Avenida Norte", "+34 600000002", "ricardo.gerencia@gym.com", "Gerente", 10);
		Usuarios admin3 = new PersonalAdministracion("Lucía", "Calle Mayor", "+34 600000003", "lucia.comercial@gym.com", "Comercial", 6);
		Usuarios admin4 = new PersonalAdministracion("Sergio", "Calle de la Paz", "+34 622334411", "sergio.mantenimiento@gym.com", "Mantenimiento", 8);
		Usuarios admin5 = new PersonalAdministracion("Beatriz", "Plaza Nueva 4", "+34 633445566", "beatriz.coord@gym.com", "Coordinadora", 7);
		
		
		ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
		listaUsuarios.add(miembroRegular1);
		listaUsuarios.add(miembroRegular2);
		listaUsuarios.add(miembroRegular3);
		listaUsuarios.add(miembroRegular4);
		listaUsuarios.add(miembroRegular5);

		listaUsuarios.add(entrenador1);
		listaUsuarios.add(entrenador2);
		listaUsuarios.add(entrenador3);
		listaUsuarios.add(entrenador4);
		listaUsuarios.add(entrenador5);

		listaUsuarios.add(admin1);
		listaUsuarios.add(admin2);
		listaUsuarios.add(admin3);
		listaUsuarios.add(admin4);
		listaUsuarios.add(admin5);
		
		
		

		Grupal clase1 = new Grupal("Yoga Zen", (Entrenadores) entrenador1, 20, Categoria.Yoga);
		Grupal clase2 = new Grupal("Crossfit Total", (Entrenadores) entrenador2, 15, Categoria.Cardio);
		Grupal clase3 = new Grupal("Pilates Core", (Entrenadores) entrenador3, 10, Categoria.Pilates);
	

		ArrayList<Grupal> listaClasesGrupal = new ArrayList<Grupal>();
		
		listaClasesGrupal.add(clase1);
		listaClasesGrupal.add(clase2);
		listaClasesGrupal.add(clase3);
		
		
		ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
		
		Reserva reserva1 = new Reserva((MiembrosRegulares) miembroRegular1, clase1);
		Reserva reserva2 = new Reserva((MiembrosRegulares) miembroRegular2, clase1);
		Reserva reserva3 = new Reserva((MiembrosRegulares) miembroRegular3, clase2);
		Reserva reserva4 = new Reserva((MiembrosRegulares) miembroRegular4, clase2);
		Reserva reserva5 = new Reserva((MiembrosRegulares) miembroRegular5, clase3);
		Reserva reserva6 = new Reserva((MiembrosRegulares) miembroRegular1, clase2);
		Reserva reserva7 = new Reserva((MiembrosRegulares) miembroRegular2, clase3);
		Reserva reserva8 = new Reserva((MiembrosRegulares) miembroRegular3, clase1);
		Reserva reserva9 = new Reserva((MiembrosRegulares) miembroRegular4, clase3);
		Reserva reserva10 = new Reserva((MiembrosRegulares) miembroRegular5, clase1);

		listaReservas.add(reserva1);
		listaReservas.add(reserva2);
		listaReservas.add(reserva3);
		listaReservas.add(reserva4);
		listaReservas.add(reserva5);
		listaReservas.add(reserva6);
		listaReservas.add(reserva7);
		listaReservas.add(reserva8);
		listaReservas.add(reserva9);
		listaReservas.add(reserva10);
		
		Gimnasio miGimnasio = new Gimnasio();

		miGimnasio.setListaUsuarios(listaUsuarios);
		miGimnasio.setListaReservas(listaReservas);
		miGimnasio.setListaClasesGrupal(listaClasesGrupal);
		
		System.out.println(miGimnasio.toString());
		
		System.out.println(miGimnasio.claseGrupalMasReservas().getNombre());
		
		miGimnasio.reservar((MiembrosRegulares) miembroRegular1, clase3);
		miGimnasio.cancelarReserva((MiembrosRegulares) miembroRegular1, clase1);
		
		
	}

}
