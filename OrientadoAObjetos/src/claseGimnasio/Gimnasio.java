package claseGimnasio;

import java.util.ArrayList;


public class Gimnasio {
	private ArrayList<Usuarios> listaUsuarios;
	private ArrayList<Reserva> listaReservas;
	private ArrayList<Grupal> listaClasesGrupal;
	
	public Gimnasio(ArrayList<Usuarios> listaUsuarios, ArrayList<Reserva> listaReservas,
			ArrayList<Grupal> listaClasesGrupal) {
		super();
		this.listaUsuarios = listaUsuarios;
		this.listaReservas = listaReservas;
		this.listaClasesGrupal = listaClasesGrupal;
	}
	
	public Gimnasio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Usuarios> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuarios> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	public ArrayList<Grupal> getListaClasesGrupal() {
		return listaClasesGrupal;
	}
	public void setListaClasesGrupal(ArrayList<Grupal> listaClasesGrupal) {
		this.listaClasesGrupal = listaClasesGrupal;
	}
	
	@Override
	public String toString() {
		return "Gimnasio [listaUsuarios=" + listaUsuarios + ", listaReservas=" + listaReservas + ", listaClasesGrupal="
				+ listaClasesGrupal + "]";
	}

	
	// metodo que devuelva cual es la clase grupal que mas usuarios tiene reservado
	
	public Grupal claseGrupalMasReservas() {
		Grupal clase = new Grupal();
		int cantidadMasReservas = 0;
		for (int i = 0; i < listaClasesGrupal.size(); i++) {
			int contar = 0;
			for (int j = 0; j< listaReservas.size(); j++) {
				if (listaReservas.get(i).getClases().equals(listaClasesGrupal.get(i))) 
					contar++;
				
			}
			if(contar > cantidadMasReservas) {
				clase = listaClasesGrupal.get(i);
				cantidadMasReservas = contar;
			}
			
			
		}
		return clase;
		
	}
	
	public MiembrosRegulares miembroMasReservas() {
		MiembrosRegulares miembro = new MiembrosRegulares();
		int masReservas = 0;
		for (Usuarios usuario : listaUsuarios) {
			if(usuario instanceof MiembrosRegulares) {
				int cantidadReservas = 0;
				for (Reserva reserva : listaReservas) {
					if (reserva.getUsuarios().equals(usuario)) {
						cantidadReservas++;
						
					}
				}
				if (cantidadReservas > masReservas) {
					masReservas = cantidadReservas;
					miembro = (MiembrosRegulares) usuario;
				}
			}
		}
		
		return miembro;	
	}
	
	
	// Ejercicio 5
	
	
}
