package claseGimnasio;

public class Reserva {
	private Usuarios usuarios;
	private Grupal clases;
	public Reserva(Usuarios usuarios, Grupal clases) {
		super();
		this.usuarios = usuarios;
		this.clases = clases;
	}
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}
	public Grupal getClases() {
		return clases;
	}
	public void setClases(Grupal clases) {
		this.clases = clases;
	}
	@Override
	public String toString() {
		return "Reserva [usuarios=" + usuarios + ", clases=" + clases + "]";
	}
	
	
	

}
