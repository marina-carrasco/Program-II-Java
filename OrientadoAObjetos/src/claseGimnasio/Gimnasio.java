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

	
	
}
