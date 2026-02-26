package claseRedSocial;

import java.util.ArrayList;

public class RedSocial {
	private ArrayList<Usuarios> listaUsuarios;

	public RedSocial(ArrayList<Usuarios> listaUsuarios) {
		super();
		this.listaUsuarios = listaUsuarios;
	}

	public RedSocial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Usuarios> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuarios> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	@Override
	public String toString() {
		return "RedSocial [listaUsuarios=" + listaUsuarios + "]";
	}
	

}
