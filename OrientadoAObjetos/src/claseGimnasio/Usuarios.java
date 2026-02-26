package claseGimnasio;

public abstract class Usuarios {
	private String nombre;
	private String direccion;
	private String numeroTlf;
	private String correo;
	public Usuarios(String nombre, String direccion, String numeroTlf, String correo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTlf = numeroTlf;
		this.correo = correo;
	}
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeroTlf() {
		return numeroTlf;
	}
	public void setNumeroTlf(String numeroTlf) {
		this.numeroTlf = numeroTlf;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", direccion=" + direccion + ", numeroTlf=" + numeroTlf + ", correo="
				+ correo + "]";
	}
	
	
}
