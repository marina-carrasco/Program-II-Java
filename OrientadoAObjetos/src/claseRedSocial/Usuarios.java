package claseRedSocial;

import java.util.ArrayList;

public class Usuarios {
	private String usuario;
	private String email;
	private ArrayList<Publicacion> listaPublicaciones;
	private ArrayList<Comentarios> listaComentarios;
	public Usuarios(String usuario, String email, ArrayList<Publicacion> listaPublicaciones,
			ArrayList<Comentarios> listaComentarios) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.listaPublicaciones = listaPublicaciones;
		this.listaComentarios = listaComentarios;
	}
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}
	public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}
	public ArrayList<Comentarios> getListaComentarios() {
		return listaComentarios;
	}
	public void setListaComentarios(ArrayList<Comentarios> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}
	@Override
	public String toString() {
		return "Usuarios [usuario=" + usuario + ", email=" + email + ", listaPublicaciones=" + listaPublicaciones
				+ ", listaComentarios=" + listaComentarios + "]";
	}
	
	

}
