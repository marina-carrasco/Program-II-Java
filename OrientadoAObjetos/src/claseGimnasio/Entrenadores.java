package claseGimnasio;

public class Entrenadores extends Usuarios {
	private String certificacion;
	private String especialidad;
	public Entrenadores(String nombre, String direccion, String numeroTlf, String correo, String certificacion,
			String especialidad) {
		super(nombre, direccion, numeroTlf, correo);
		this.certificacion = certificacion;
		this.especialidad = especialidad;
	}
	public Entrenadores() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entrenadores(String nombre, String direccion, String numeroTlf, String correo) {
		super(nombre, direccion, numeroTlf, correo);
		// TODO Auto-generated constructor stub
	}
	public String getCertificacion() {
		return certificacion;
	}
	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "Entrenadores [certificacion=" + certificacion + ", especialidad=" + especialidad + ", getNombre()="
				+ getNombre() + ", getDireccion()=" + getDireccion() + ", getNumeroTlf()=" + getNumeroTlf()
				+ ", getCorreo()=" + getCorreo() + "]";
	}
	
	
	
	

}
